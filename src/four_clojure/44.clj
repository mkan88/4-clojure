(defn rotate [n col]
  (let [c (count col)
        n (mod n (count col))]
    (concat
     (take-last (- c n) col)
     (take n col))))