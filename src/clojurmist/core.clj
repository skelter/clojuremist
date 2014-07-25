(ns clojurmist.core
  (:use [apparatus config cluster]))

(def myinstance 
  (instance (config)))

(def mylist (get-list "mylist"))

(def mymap (get-map "mymap"))

(def addressbook (get-list "addressbook"))


(defn -main [& args]
       (println (count mylist))
       (println "addressbook: " (count addressbook) " entries.")
       )
