(ns make-x.farmlogs.interview-test
  (:require [clojure.test :refer :all]
            [farmlogs.interview :refer :all]))

(deftest line-x-size-0
  (testing "line-x size 0."
    (is (= "\n" (line-x 0)))
    )
  )

(deftest line-x-size-1
  (testing "line-x size 1."
    (is (= "X\n" (line-x 1)))
    )
  )

(deftest line-x-size-2
  (testing "line-x size 2."
    (is (= "XX\n" (line-x 2)))
    )
  )

(deftest line-x-size-3
  (testing "line-x size 3."
    (is (= "X X\n" (line-x 3)))
    )
  )

(deftest line-x-size-10
  (testing "line-x size 10."
    (is (= "X        X\n" (line-x 10)))
    )
  )

(line-x-size-0)
(line-x-size-1)
(line-x-size-2)
(line-x-size-3)
(line-x-size-10)
