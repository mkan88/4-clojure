(defn reverse-interleave [col n]
  (apply map vector (partition-all n col)))