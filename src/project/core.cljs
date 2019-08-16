(ns project.core
  (:require [project.module :refer [string]]
            project.cljs.core)
  (:require-macros [project.module-2 :refer [settings-map-string]]))

(println "via macro in module.cljc" string)
(println "via macro in module_2.clj" (settings-map-string))
