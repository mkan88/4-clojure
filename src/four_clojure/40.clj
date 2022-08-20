(defn interpose [sep col]
  (butlast (mapcat #(conj (vector %) sep) col)))