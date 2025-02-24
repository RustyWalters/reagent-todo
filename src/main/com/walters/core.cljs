(ns com.walters.core
  (:require [reagent.dom :as rdom]))

(defn title []
  [:h1 "todos"])

(defn todo-app []
  [:div
   [:section.todoapp
    [:header.header
      [title]]]])

(defn start []
  (js/console.log "Starting ...")
  (rdom/render [todo-app]
            (.getElementById js/document "app")))

(defn stop []
  (js/console.log "Stopping ..."))

(defn ^:export run []
  (start))
  
