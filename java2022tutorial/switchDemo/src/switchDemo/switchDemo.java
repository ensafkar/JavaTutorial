package switchDemo;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'F';
		
		switch(grade) {
		case 'A':
			System.out.println("Perfect : Passed");
			break;
		case 'B':
			System.out.println("Very well : Passed");
			break;
		case 'C':
			System.out.println("Not bad : Passed");
			break;
		case 'F':
			System.out.println("Unfortunately : Failed");
			break;
			default:
				System.out.println("Invalid note");
		}

	}

}
