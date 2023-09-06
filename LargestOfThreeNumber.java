package com.java.assignments;
import java.util.Scanner;
public class LargestOfThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		
		int num1 = scanner.nextInt();
		System.out.print("Enter the Second number: ");
		
		int num2 = scanner.nextInt();
		System.out.print("Enter the third number: ");
		
		int num3 = scanner.nextInt();
		
		int largest = findLargest(num1, num2, num3);
		
		System.out.print("The Largest number is: " + largest);

	}
	
	public static int findLargest(int num1, int num2, int num3) {
		int largest = num1;
		
		if (num2 > largest) {
			largest = num2;
		}
		if(num3 > largest) {
			largest = num3;
		}
		
		return largest; 
	}

}
