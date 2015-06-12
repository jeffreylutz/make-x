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
    (str
      (str/join
        (assoc
          (assoc
            (vec (repeat size \space) )            ; Create vector of \space of size of size
            pos "X")                                        ; Replace space with 'X' from left side position
          (- (- size 1) pos) "X")                           ; Replace space with 'X' from right side position
        )                                                   ; collapse vector of chars back to string
      "\n")                                                 ; append newline to end of string
  )

(defn make-x [size]
  (apply print
         (map line-at-pos (range size) (repeat size size))
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
