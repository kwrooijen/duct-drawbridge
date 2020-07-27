(ns duct.middleware.drawbridge
  (:require
   [ring.middleware.basic-authentication :refer [wrap-basic-authentication]]
   [integrant.core :as ig]))

(defn- authenticated? [correct-name correct-pass]
  (fn [name pass]
    (= [name pass] [correct-name correct-pass])))

(defmethod ig/init-key :duct.middleware.drawbridge/auth [_ {:auth/keys [name pass]}]
  (fn [handler]
    (wrap-basic-authentication
     handler
     (authenticated? name pass))))
