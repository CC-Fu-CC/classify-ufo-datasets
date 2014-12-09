(ns classify-ufo.model-test
  (:use clojure.test )
  (:require [classify-ufo.model :as m]))

(def data (m/read-data "small_ufo_dataset.tsv"))

(deftest test-count-is-25
  (is (= (count (remove (comp clojure.string/blank? :location) data )) 25 ) ))
