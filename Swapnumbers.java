package demo.java.datatype;

public class Swapnumbers {

	public static void main(String[] args) {
	int a = 33;
	int b = 11;
	System.out.println("Numbers before swapping:");
	System.out.println("a = " + a +" b = " + b);
	
	a = a*b;
	b = a/b;
	a = a/b;
	System.out.println("Numbers after swapping:");
	System.out.println("a = " + a + " b = " + b);
	}

}
