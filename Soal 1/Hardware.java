// Class Child dari Class Memory bernama Hardware berisikan brand dan model

class Hardware extends Memory{
	protected String brand;
	protected String model;
	/* Protected hanya dapat di akses oleh class itu sendiri atau turunan(Inheritance)
		dan tidak dapat di akses di luar itu.
	*/
	public void setBrand(String iBrand){
		brand = iBrand;
	}

	public void setModel(String iModel){
		model = iModel;
	}
	// Get Attributes
	public String getBrand(){
		return brand;
	}

	public String getModel(){
		return model;
	}
	// Set Attributes

}