(ns farmlogs.interview
  (:require [clojure.string :as str]))
; Given an integer, draw an X with the given dimensions, ie:
;
; => make-x(5)
;
;     X   X
;      X X
;       X
;      X X
;     X   X
;
; X  X
;  XX
;  XX
; X  X

;
; X
; XX
; X X
; X  X

(defn line-at-pos [pos size]
  (-> (repeat size \space)
      (vec)                                                 ;Create vector of \space of size of size
      (assoc pos "X")                                       ;Replace space with 'X' from left size position
      (assoc (- (- size 1) pos) "X")                        ;Replace space with 'X' from right side position
      (str/join)                                            ;Collapse vector of chars back to string
      )
  )

(defn make-x [size]
  (
    doseq [i (map line-at-pos (range size) (repeat size size))]
    (println i)
    )
  )

(println "Print 0")
(make-x 0)
(println "\nPrint 1")
(make-x 1)
(println "\nPrint 2")
(make-x 2)
(println "\nPrint 3")
(make-x 3)
(println "\nPrint 4")
(make-x 4)
