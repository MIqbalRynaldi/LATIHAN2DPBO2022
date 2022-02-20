// Class Child dari Class Hardware bernama Product berisikan idProduct dan price

class Product extends Hardware{
	protected int idProduct;
	protected int price;
	/* Protected hanya dapat di akses oleh class itu sendiri atau turunan(Inheritance)
		dan tidak dapat di akses di luar itu.
	*/
	public void setIdProduct(int iIdProduct){
		idProduct = iIdProduct;
	}

	public void setPrice(int iPrice){
		price = iPrice;
	}

	// Get Attributes
	public int getIdProduct(){
		return idProduct;
	}

	public int getPrice(){
		return price;
	}
	// Set Attributes

}