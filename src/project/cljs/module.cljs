(ns project.cljs.module
  (:require [project.cljs.utils :as utils]))

(def string (pr-str (utils/get-settings-map)))
