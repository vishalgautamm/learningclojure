(ns learnclojure)

; creating a variable
(def greet "Hello")

(let [name "John Doe"]
  (print "Hello, " name))

; if else in Clojure
(if (empty? greet)
  "It is empty"
  "It is not empty")


(if-not (empty? greet)
  (do
    (println "All good")
    :ok))

(when-not (empty? greet)
  (println "OK")
  :cool)

(when (not (empty? greet)) :ok)


; Express more complicated situataion by using case - it is like a switch statement

(case greet
  "Bonjour" :goodbye
  "Hi" :hello
  :nothing)

; Even more complicated matching
(cond
  (= greet "Bonjour") :bonjour
  (= (apply str(reverse greet)) "olleH") :Hello
  :else :nothing)

(apply str(reverse greet))


