(ns learnclojure)

(type 1)
(type 1.1)
(type true)
(type nil)
(type "Hello world")

(type :k)
(type (keyword "a"))

(type (quote a))
(type 'b)

; Data structures
(type (list 1 2 3 4))
(type (vector 1 2 3 4))

(comment
  ; Differences between lists and vectors
  ; Lists are linked list while vectors are array like data structures
  )

; For indexed access, vectors will have better performance
(nth (vector 1 2 3 4 5) 2)

; On the other hand a list will have superior performance if we are taking items off the head of the list
; operations such as first on the list will be must faster than the operation such as last

(first (list 1 2 3))
(last ( list 1 2 3 4 5 6 7 8 9 10))


; Map - list of keys and values
(type (hash-map :a 1 :b 2 :c 3))

; Set - useful for performing set operations and they are represented using #{}
(type #{1 2 3 4})