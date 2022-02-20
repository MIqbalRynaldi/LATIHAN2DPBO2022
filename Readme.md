Saya Muhammad Iqbal Rynaldi mengerjakan Latihan 2
untuk mata kuliah DPBO untuk keberkahan-Nya maka saya tidak melakukan kecurangan yang seperti yang telah dispesifikasikan. Aamiin

# Penjelasan Desain Program

Terdapat 3 Class yaitu class Memory, Product, Hardware

Memory menjadi class paling atas atau parent dari semua class tersebut.

Lalu class Hardware menjadi child dari kelas Memory (extends) 

dan yang terakhir kelas Product menjadi child dari kelas Hardware (extends)


Memory (Frequency, MemorySize, supportsCuda)
	-> Hardware (brand, model)
		-> Product (price, idProduct)