package com.java.assignments;
import java.util.Scanner; 

public class CelsiusToFarhrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
		
	}

}
