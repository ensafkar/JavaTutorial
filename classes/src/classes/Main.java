package classes;

public class Main {

	public static void main(String[] arguments) {
		//reference type 
		CustomerManager customerManager;
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.uptade();
		// Stack ve Heap stackde customermanager tanımlanır
		//{heap da customer manager nesenesi oluşur}
		
		int sayi1 = 10;
		int sayi2= 20;
		sayi2 = sayi1;
		//sayi 2 ye sayi 1 i atadığım için için sayi 2 nin değeri 10
		sayi1 = 30;
		//tekrar sayi 1 e değer atadım
		System.out.println(sayi2);
		//sayı 2 yi sorduğum için sayı 2 stackde depolandığı icin degeri değişmedi ve 10 olarak kaldı
		
		 

	}
	
	

}
