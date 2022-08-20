(defn split-by-type [col]
  (vals (group-by type col)))