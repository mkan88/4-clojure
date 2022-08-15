(fn [lst n]
    (mapcat #(repeat n %) lst)
)