(defn drop-nth [col n]
  (mapcat #(take (- n 1) %) (partition-all n col))
)