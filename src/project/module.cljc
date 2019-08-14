(ns project.module
  #?(:clj
     (:require [project.settings :as settings]))
  #?(:cljs
     (:require-macros [project.module :refer [compiled-string]])))

#?(:clj
   (do

(defmacro compiled-string []
  `(do ~(pr-str {:foo settings/foo :bar settings/bar :baz settings/baz})))

))

#?(:cljs
   (do

(def string (compiled-string))

))
