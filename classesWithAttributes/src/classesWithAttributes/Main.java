package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","Acer laptop",1000,2,"Kırmızı");
		/*
		 * product.setName("Laptop"); product.setıd(1);
		 * product.setDescription("Acer Laptop"); product.setPrice(10500);
		 * product.setRenk("Kırmızı"); product.getıd(); product.getKod();
		 */

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
