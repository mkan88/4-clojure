#(reduce
   (fn [x lst] (conj x lst)) 
   '() %
)