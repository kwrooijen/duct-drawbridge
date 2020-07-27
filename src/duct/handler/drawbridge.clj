(ns duct.handler.drawbridge
  (:require
   [integrant.core :as ig]
   [drawbridge.core]))

(defonce ^:private nrepl-handler
  (drawbridge.core/ring-handler))

(defmethod ig/init-key :duct.handler/drawbridge [_ _opts]
  (fn [request]
    (nrepl-handler request)))
