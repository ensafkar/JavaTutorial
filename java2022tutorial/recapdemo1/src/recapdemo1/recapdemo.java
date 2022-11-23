package recapdemo1;

public class recapdemo {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 24;
		int sayi3 = 266;
		int enBuyuk = sayi1;
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
			
		System.out.println("En buyuk ="+enBuyuk);
	}

}
