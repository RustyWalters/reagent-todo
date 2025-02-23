(ns com.walters.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defn another-component []
  [:div
   [:p "I am another component"]
   [:p
    "I have " [:strong "bold"
                       [:span {:style {:color "blue"}} " and blue "] "text."]]])
 
(defn simple-component []
  [:div
   [:p "I am a component"]
   [:p
    "I have " [:strong "bold"
                       [:span {:style {:color "red"}} " and red "] "text."]]
   [another-component]])


(defn ^:export run []
  (rdom/render [simple-component]
            (.getElementById js/document "app")))

(comment
  (js/alert "Hello, World!")
  (another-component))
  
