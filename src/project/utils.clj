(ns project.utils
  (:require [project.settings :as settings]))

(def m {:foo settings/foo :bar settings/bar :baz settings/baz})

(defn get-settings-map []
  m)
