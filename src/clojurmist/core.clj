(ns clojurmist.core
  (:use [apparatus config cluster]))

(def myinstance 
  (delay  (instance (config))))


