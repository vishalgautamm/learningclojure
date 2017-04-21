(ns learnclojure)

(def x
  (list 1 2 3))

(def v
  (vector 1 2 3))

(first v)
(last v)
(nth x 5 "Does Not exist")

(cons 0 x)
(conj v 0)

;conj adds items from the from the front to list and adds element from the back to the vector

(type (concat x v))
; when you concat a list and a vector together - clojure produces what is known as Lazy Sequences
; aka concat has producted an objet that knows how to make the sequence but hasnt actually done the work
; hasnt copied anything, or done any CPU wotk beyong necessary to produce this lazy sequence


; maps

(def m {:a 1 :b 2})
(type m)
;Persistent Arrat map
(type (array-map :a 1 :b 2))

;Persistent hash map
(type (hash-map :x 1 :y 2 :z 3))

; adding items to the map

(assoc {:a 1} :c 3)
(assoc-in { :settings {:a 1 :b 2}} [:settings :a] "a")

(update-in {:settings {:x 1 :y 2}} [:settings :x] inc)

(get m :b)


; SET {}

(def s #{1 3 4})

(conj s 5)
(conj s 6)

(disj s 1)
(disj s 5)
(disj s 1 3)

(contains? s 1)
(contains? s 7)
