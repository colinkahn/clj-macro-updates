(ns project.module
  #?(:clj
     (:require [project.settings :as settings]))
  #?(:cljs
     (:require-macros [project.module :refer [compiled-string]])))

#?(:clj
   (do

(def m {:foo settings/foo :bar settings/bar :baz settings/baz})

(defmacro compiled-string []
  `(do ~(pr-str m)))

))

#?(:cljs
   (do

(def string (compiled-string))

))
