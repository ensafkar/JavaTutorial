package arraysDemo;

public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1="Yunus";
		String ogrenci2="Gurdal";
		String ogrenci3="Sena";
		
		String[] ogrenciler = new String[3];
		ogrenciler[0]="Yunus";
		ogrenciler[1]="Gurdal";
		ogrenciler[2]="Sena";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			System.out.println("--------------");
		}
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
			
		}

	}

}
