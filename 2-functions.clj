(ns learnclojure)
(def greet(fn [] "Hello world"))

(defn greet2
  "Greets a person named <name> with their <title>"
  [name title]
  (str "Bonjour, " title ". " name))
(greet2 "Vishal" "Mr")

(require '[clojure.repl :refer [doc]])
(doc greet2)

; Example: multiple variadic arguments
(defn hello [& args]
  (str "Hello, " (apply str args)))
(hello "Fred" " Julie")

(defn hello2
  ([] "Hey man")
  ([name] (str "Hello, " name))
  ([name title] (str "Hello, " title ". " name)))

(hello2 "John Doe" "Mr")
