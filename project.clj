(defproject kwrooijen/duct-drawbridge "0.1.0"
  :description "Duct library for Drawbridge"
  :url "https://github.com/kwrooijen/duct-drawbridge"
  :license {:name "MIT"}
  :dependencies [[nrepl/drawbridge "0.2.1"]
                 [integrant "0.8.0"]
                 [ring-basic-authentication "1.0.5"]]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :sign-releases false}]])
