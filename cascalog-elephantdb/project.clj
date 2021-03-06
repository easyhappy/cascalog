(defproject cascalog/cascalog-elephantdb "1.10.1-SNAPSHOT"
  :description "ElephantDB Integration for Cascalog."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"conjars.org" "http://conjars.org/repo"}
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-options ["-source" "1.6" "-target" "1.6"]
  :jvm-opts ["-server" "-Xmx768m"]
  :dependencies [[cascalog/cascalog-core "1.10.1-SNAPSHOT"]
                 [elephantdb/elephantdb-cascading "0.3.5"]]
  :plugins [[lein-midje "3.0-alpha4"]]
  :profiles {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0-RC1"]]}
             :dev {:dependencies
                   [[org.apache.hadoop/hadoop-core "1.0.3"]
                    [midje "1.5-alpha10"]
                    [midje-cascalog "0.4.0"
                     :exclusions [org.clojure/clojure]]]}})
