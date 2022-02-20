#include <iostream>
#include <string>
using namespace std;

class Hardware: public Memory
{

	public:
		string brand;
		string model;
		void setBrand(string iBrand){
			brand = iBrand;
		}
		void setModel(string iModel){
			model = iModel;
		}
		
		string getBrand(){
			return brand;
		}

		string getModel(){
			return model;
		}
};