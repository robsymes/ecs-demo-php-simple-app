(use 'clojure.test)
(require '[clojure.core.match :refer [match]])
;(require '[game-peer.combat.creation :as creation])
(require '[clojure.pprint :as pp])
(require '[clj-webdriver.taxi :refer :all])
;(require '[features.step-definitions.shared :refer :all])

(set-driver! {:browser :phantomjs})

(Given #"^the four tribe battle scenario is reset to in the admin console" []

;       (to "http://www.startribes.io/admin/")

       ;; Select "four tribe battle" scenario
;       (select "scenario.four-tribe-battle")

       ;; Click "Reset"
;       (click "#reset")

       )

(When #"^things have had a chance to update" []

      ; (Thread/sleep 8000)  ???

      )

(Then #"^there are four ships of each tribe displayed in the Game UI" []

;      (to "http://www.startribes.io")

      ; ???????

      ; I think we want to get a screenshot of the PIXI canvas

      ; (take-screenshot format)
      ; (format can be :file, :base64, or :bytes)
      ; - maybe get it as bytes and then check pixels by position?

      ; and then get the pixel values at positions where we expect
      ; ships to be, and test that they are about what we expect
      ; (perhaps by testing R,G,B are each within a given range)
      ; - then check some other (random) places and check there are
      ;   no ships there (range-checking the R,G,B values)

      ; if we start with just one ship, that should be in the centre of
      ; the screen, then I think it could be do-able, and we can then build
      ; it out from there...



      )



#_(When #"^the website url is visited" []

      (println "[[ Visit website url ]]")

;      (to "http://localhost")
;      (to "http://beta-www.startribes.io")
      (to "http://www.startribes.io")

      (wait-until #(.contains (text "body") "Star Tribes"))

      (assert (= :something
                 :something)))
