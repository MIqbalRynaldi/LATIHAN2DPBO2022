#include <iostream>
#include <string>
using namespace std;

class Product: public Hardware
{

	public:
		int idProduct;
		int price;

		void setIdProduct(int iIdProduct){
			idProduct = iIdProduct;
		}
		
		void setPrice(int iPrice){
			price = iPrice;
		}
		
		int getIdProduct(){
			return idProduct;
		}

		int getPrice(){
			return price;
		}	
};