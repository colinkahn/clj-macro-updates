(ns project.cljs.utils
  (:require [project.cljs.settings :as settings]))

(def m {:foo settings/foo :bar settings/bar :baz settings/baz})

(defn get-settings-map []
  m)
