(ns clojurmist.core
  (:use [apparatus config cluster]))

(def myinstance 
  (delay  (instance (config))))

(def mylist (get-list "mylist"))

(def mymap (get-map "mymap"))

(println (count mylist))
