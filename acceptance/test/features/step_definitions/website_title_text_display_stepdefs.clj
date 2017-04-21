(use 'clojure.test)
(require '[clojure.core.match :refer [match]])
;(require '[game-peer.combat.creation :as creation])
(require '[clojure.pprint :as pp])
(require '[clj-webdriver.taxi :refer :all])
;(require '[features.step-definitions.shared :refer :all])

(set-driver! {:browser :phantomjs})

(When #"^the website url is visited" []

      (println "[[ Visit website url ]]")

;      (to "http://localhost")
      (to "http://www.startribes.io:8080")
;      (to "http://beta-www.startribes.io")
;      (to "http://www.startribes.io")

      (wait-until #(.contains (text "body") "Star Tribes"))

      (assert (= :something
                 :something)))
