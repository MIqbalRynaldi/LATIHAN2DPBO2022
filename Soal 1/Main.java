public class Main {
	public static void main(String[] args){
		Product product = new Product();
		product.setIdProduct(1);
		product.setPrice(300000);
		product.setBrand("Intel");
		product.setModel("I3 3302U");
		product.setFrequency(40002);
		product.setMemorySize(30);
		product.setSupportsCuda(8);
		// set Data Product

		System.out.println("Id Product = " + product.getIdProduct());
		System.out.println("\t Harga = " + "RP " + product.getPrice());
		System.out.println("\t Brand = " + product.getBrand());
		System.out.println("\t Model = " + product.getModel());
		System.out.println("\t\t Frequency = " + product.getFrequency());
		System.out.println("\t\t MemorySize = " + product.getMemorySize() + " MB");
		System.out.println("\t\t SupportCuda = " + product.getSupportsCuda() + " core");
		// Print
	}
}