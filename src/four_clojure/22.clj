#(reduce
   (fn [n rest] (inc n))
   0 %
)