#include <iostream>
#include <string>
#include "Memory.h"
#include "Hardware.h"
#include "Product.h"
using namespace std;

int main(int argc, char const *argv[])
{
	Product product;
	product.setIdProduct(1);
	product.setPrice(300000);
	product.setBrand("Intel");
	product.setModel("I3 3302U");
	product.setFrequency(40002);
	product.setMemorySize(30);
	product.setSupportsCuda(8);

	cout << "Id Product = " << product.getIdProduct() << "\n";
	cout << "\t Harga = RP " << product.getPrice()<< "\n";
	cout << "\t Brand = " << product.getBrand()<< "\n";
	cout << "\t Model = " << product.getModel()<< "\n";
	cout << "\t\t Frequency = " << product.getFrequency()<< "\n";
	cout << "\t\t MemorySize = " << product.getMemorySize()<< " MB\n";
	cout << "\t\t SupportCuda = " << product.getSupportsCuda()<< " core \n";
	return 0;
}
