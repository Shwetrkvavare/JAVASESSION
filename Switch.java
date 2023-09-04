package demo.java.datatype;

public class Switch {

	public static void main(String[] args) {
		char grade='C';
		
		switch(grade) {
		
		case'A':
			System.out.println("Excellent");
			break;
		case'B':
			System.out.println("Good");
			break;
		case'C':
			System.out.println("OK");
			break;
		default:
			System.out.println("Invalid Grade");
		}

	}

}
