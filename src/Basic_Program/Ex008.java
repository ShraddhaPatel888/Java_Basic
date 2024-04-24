package Basic_Program;

import java.util.Scanner;

public class Ex008 {

	public static void main(String[] args) {
		
		//Program to Check if a Number is Prime or Not
		
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is prime
	        boolean isPrime = true;
	        if (number <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        // Output the result
	        if (isPrime) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	}

}
