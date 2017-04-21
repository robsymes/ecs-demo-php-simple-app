(ns acceptance.core-test
  (:require [clojure.test :refer :all]
            [acceptance.core :refer :all])
  (:use [leiningen.cucumber])
  (:import [cucumber.api.cli Main]))

#_(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest run-cukes
  (. cucumber.api.cli.Main (main (into-array ["--plugin" "pretty" "--glue" "test" "test/features"]))))

#_(deftest ^:current run-current-cukes
    (. cucumber.api.cli.Main (main (into-array ["--plugin" "pretty" "-t" "@Current" "--glue" "test" "test/features"]))))
