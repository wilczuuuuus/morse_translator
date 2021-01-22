(ns fp.morse
  (:require [clojure.string :as s]))
(def dictionary
  {:a ".-" :b "-..." :c "-.-." :d "-.." :e "." :f "..-." :g "--." :h "...." :i ".." :j ".---" :k "-.-" :l ".-.." :m "--" :n "-." :o "---" :p "--.-" :q "--.-" :r ".-." :s "..." :t "-" :u "..-" :v "...-" :w ".--" :x "-..-" :y "-.--" :z "--.." })

(defn lower-split [wyraz]
(s/split (s/lower-case wyraz)""))

(defn morse-me []
  (for [x (lower-split (read-line))] (map dictionary x)))

