(defproject acceptance "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.match "0.3.0-alpha4"]

                                        ;  [lein-cucumber "1.0.2"]
                 ;  USING THIS VERSION TO GET MORE UP-TO-DATE CUCUMBER-JVM
                 [org.clojars.punkisdead/lein-cucumber "1.0.7"]


                 [org.seleniumhq.selenium/selenium-server "3.0.0-beta3"]
                 [clj-webdriver "0.7.2"]

                 [com.codeborne/phantomjsdriver "1.2.1"
                  :exclusions [org.seleniumhq.selenium/selenium-java
                               org.seleniumhq.selenium/selenium-server
                               org.seleniumhq.selenium/selenium-remote-driver]]
                 [org.seleniumhq.selenium/selenium-java "3.0.0-beta3"]

                 ]

  ;; Added these...
  :plugins [; [lein-cucumber "1.0.2"]
            [org.clojars.punkisdead/lein-cucumber "1.0.7"]
            [lein-test-out "0.3.1"]]
  :cucumber-feature-paths ["test/features/"]

  :test-selectors {:default (complement :current)
                   :current :current}



  :main ^:skip-aot acceptance.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
