package Basic_Program;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// Program to Check if a Number is Positive, Negative, or Zero.
		
		
	        Scanner scanner = new Scanner(System.in); //use for take input form the user

	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();

	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }

	        scanner.close();

	}

}
