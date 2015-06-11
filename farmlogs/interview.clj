 (ns interview)
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
      (if (< size 1)  "" (if (< size 2) "X" (if (< size 3) "XX" (str "X" (apply str (repeat (- size 2) " ")) "X"))))



      )

(defn make-x [size]
      (if (< size 3) (println (line-x size))
                     ;;    ( (println (line-x size))
                     ;      (println (make-x (- size 2)))
                     ;     (println (line-x size)))
                     )

      ;  (println (line-x size))
      ;  (make-x (- size 2))
      ;  (println (line-x size))
      )

(println (line-x 3))
;(make-x 0)
;(make-x 1)
;(make-x 2)
;(make-x 3)
;(make-x 4)
