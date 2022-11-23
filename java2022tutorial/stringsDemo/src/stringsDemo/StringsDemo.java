package stringsDemo;

public class StringsDemo {

	public static void main(String[] args) {
		String message = "    Bugun hava cok guzel.  ";
		System.out.println(message);
//		System.out.println("Eleman sayisi :" + message.length());
//		System.out.println("5. eleman :" + message.charAt(4));
//		System.out.println(message.concat(" Yasasin!"));
//		System.out.println(message.startsWith("B"));
//		System.out.println(message.endsWith("."));
//		char[] karakterler = new char[5];
//		message.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		System.out.println(message.indexOf("av"));
//		System.out.println(message.lastIndexOf("e"));
		String yeniMesaj = message.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(message.substring(2,5));
		
		for(String kelime : message.split(" ")) {
			System.out.println(kelime);
			
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
		

	}

}
