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

; (repeat 1 " ") ; [" "]
; (repeat 3 " ") ; [" ", " ", " "]

(defn line-x [size]
  (if (< size 1) "" (if (< size 2) "X\n" (if (< size 3) "XX\n" (str "X" (apply str (repeat (- size 2) " ")) "X\n"))))
  )

(defn line-at-pos [pos size]
  (str/join (assoc (assoc (vec (repeat size \space))  pos "X") (- (- size 1) pos) "X"))
  )

(defn dec-sequence [size]
  (range size (- 1 (rem size 2)) -1)
  )

(defn dec-sequence [size]
  (range size (- 1 (rem size 2)) -1)
  )

(defn compute-sequence [size]
  (concat (range (quot size 2) (- 0 (mod size 2)) -1) (range 1 (+ (quot size 2) 1)))
  )

(defn make-x [size]
  (range)
  (if (< size 3) (println (line-x size))
                 ;;    ( (println (line-x size))
                 ;      (println (make-x (- size 2)))
                 ;     (println (line-x size)))
                 )

  ;  (println (line-x size))
  ;  (make-x (- size 2))
  ;  (println (line-x size))
  )

;(println (line-x 3))
;(make-x 0)
;(make-x 1)
;(make-x 2)
;(make-x 3)
;(make-x 4)
