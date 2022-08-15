(fn [& rest]
  (unchecked-negate (
                     apply min (map unchecked-negate rest))))