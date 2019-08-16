(ns project.module-2
  (:require [project.utils :as u]))

(defmacro settings-map-string []
  `(do ~(pr-str (u/get-settings-map))))
