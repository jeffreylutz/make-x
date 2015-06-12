(ns make-x.farmlogs.interview-test
  (:require [clojure.test :refer :all]
            [farmlogs.interview :refer :all]))

(deftest line-x-size-0
  (testing "line-x size 0."
    (is (= "" (line-x 0)))
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

(deftest compute-seq-0
  (testing "compute-sequence 0."
    (is (= '() (compute-sequence 0))))
  )

(deftest compute-seq-1
  (testing "compute-sequence 1."
    (is (= '(1) (compute-sequence 1))))
  )

(deftest compute-seq-2
  (testing "compute-sequence 2."
    (is (= '(2 2) (compute-sequence 2))))
  )

(deftest compute-seq-3
  (testing "compute-sequence 3."
    (is (= '(2 1 2) (compute-sequence 3))))
  )

(deftest line-at-pos-test-5
  (testing "test"
    (is (= "X   X" (line-at-pos 0 5)))))

(line-at-pos-test-5)
(make-x 5)