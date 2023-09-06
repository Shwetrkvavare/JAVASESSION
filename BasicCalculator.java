package com.java.assignments;
import java.util.Scanner; 
public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter the second number: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter the operation (+,-,*,/): ");
		char operator = scanner.next().charAt(0);
		
		double result;
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			System.out.println("The sum of " + num1 + "and" + num2 + "is" + result);
			break;
			
		case '-':
			result = num1 - num2;
			System.out.println("The sum of " + num1 + "and" + num2 + "is" + result);
			break;
			
		case '*':
			result = num1 * num2;
			System.out.println("The sum of " + num1 + "and" + num2 + "is" + result);
			break;
		
		case '/':
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("The division of " + num1 + " by " + num2 + " is " + result);
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
            break;
            
            default:
            	 System.out.println("Error: Invalid Operator");
            	 break;
            	 
	}

}
}
