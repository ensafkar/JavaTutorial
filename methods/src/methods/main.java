package methods;

public class main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

		

	}
	public static void sayiBulmaca(){
		int[] numbers = new int[] {1,2,5,7,9};
		int finder = 6;
		boolean varMi=false;
		
		
		for(int number:numbers) {
			if(number==finder) {
				varMi=true;
				break;
				
			}
		}
		if(varMi) {
			mesajVer("Sayi mevcuttur:"+finder);
			
		}else {
			mesajVer("Sayi mevcut degildir:"+finder);
		}
		
	}
	//parametli metod !! önemli bilgi mülakatlarda sorulur

	public static void mesajVer(String message) {
		System.out.println(message);
		
	}

}
