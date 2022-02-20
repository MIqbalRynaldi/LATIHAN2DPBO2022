#include <iostream>
#include <string>
using namespace std;

class Memory
{


public:
	int frequency;
	int memorySize;
	int supportsCuda;
	void setFrequency(int iFrequency){
		frequency = iFrequency;
	}
	void setMemorySize(int iMemorySize){
		memorySize = iMemorySize;
	}

	void setSupportsCuda(int iSupportsCuda){
		supportsCuda = iSupportsCuda;
	}

	int getFrequency(){
		return frequency;
	}

	int getMemorySize(){
		return memorySize;
	}

	int getSupportsCuda(){
		return supportsCuda;
	}
};