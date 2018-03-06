(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
  "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

(defproject clj-aws-s3 "0.3.10-tres-SNAPSHOT"
  :description "Clojure Amazon S3 library"
  :url "https://github.com/weavejester/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["snapshots" "http://server02:8080/repository/snapshots"] ["releases" "http://server02:8080/repository/internal"]]
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [com.amazonaws/aws-java-sdk "1.7.15"]
                 [clj-time "0.6.0"]]
  :plugins [[codox "0.8.10"]])
