package sayiBulma;

public class SayiBulma {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9};
		int finder = 8;
		boolean varMi=false;
		
		
		for(int number:numbers) {
			if(number==finder) {
				varMi=true;
				break;
				
			}
		}
		if(varMi) {
			System.out.println("Sayi mevcuttur");
			
		}else {
			System.out.println("Sayi mevcut degildir");
		}

	}

}
