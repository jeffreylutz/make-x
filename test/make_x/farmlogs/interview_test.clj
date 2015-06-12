(ns make-x.farmlogs.interview-test
  (:require [clojure.test :refer :all]
            [farmlogs.interview :refer :all]))

(deftest line-at-pos-test-0-5
  (testing "test"
    (is (= "X   X\n" (line-at-pos 0 5)))))

(deftest line-at-pos-test-1-5
  (testing "test"
    (is (= " X X \n" (line-at-pos 1 5)))))

(deftest line-at-pos-test-2-5
  (testing "test"
    (is (= "  X  \n" (line-at-pos 2 5)))))


(deftest line-at-pos-test-0-1
  (testing "test"
    (is (= "X\n" (line-at-pos 0 1)))))

(deftest line-at-pos-test-1-2
  (testing "test"
    (is (= "XX\n" (line-at-pos 1 2)))))

(line-at-pos-test-0-5)
(line-at-pos-test-1-5)
(line-at-pos-test-2-5)
(line-at-pos-test-0-1)
(line-at-pos-test-1-2)