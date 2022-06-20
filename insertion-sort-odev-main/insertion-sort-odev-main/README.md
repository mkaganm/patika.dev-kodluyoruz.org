# insertion-sort-odev

[22,27,16,2,18,6] -> Insertion Sort

1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
2. Big-O gösterimini yazınız.
3. Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

# CEVAP

[22,27,16,2,18,6] dizisinin selection sort'a göre aşamaları aşağıdaki şekilde gerçekleşir.

Önce veriler tek tek incelenerek en küçük veri tespit edilir ve en başa yazılır.

[22,27,16,2,18,6] -> [2,27,16,22,18,6]

Sonrasında aynı işlemler ikinci üçüncü ve diğer elemanlar için tekrarlanır ve son aşamada sıralı dizi elde edilir.

[2,27,16,22,18,6] -> [2,6,16,22,18,27] -> [2,6,16,18,22,27]

Gerçekleştirilen sıralama işlemi sırasında dizinin tüm elemanlarının tek tek gezilmesinden kaynaklı olarak Big-O notasyonu O(n²) olarak bulunur. 18 sayısı için gerçekleşecek senaryonun ise sayının ortada olması nedeniyle average case olacağı görülmektedir.

Ödevin ikinci aşamasında verilen [7,3,5,8,2,9,4,15,6] dizisinin selection sort'a göre sıralanmasının ilk 4 adımı ise aşağıda listelenmiştir:

1. [2,3,5,8,7,9,4,15,6]
2. [2,3,4,8,7,9,5,15,6]
3. [2,3,4,5,7,9,8,15,6]
4. [2,3,4,5,6,9,8,15,7]

