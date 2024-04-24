package Basic_Program;

public class Ex009 {

	public static void main(String[] args) {
		/* Write a program that prints numbers from 1 to 100. However,
		for multiples of 3, print "Fizz" instead of the number, and
		for multiples of 5, print "Buzz." 
		For numbers that are multiples of both 3 and 5, print "FizzBuzz." */

		
		  for (int i = 1; i <= 100; i++) {
	            // Check if the number is a multiple of both 3 and 5
	            if (i % 3 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz");
	            }
	            // Check if the number is a multiple of 3
	            else if (i % 3 == 0) {
	                System.out.println("Fizz");
	            }
	            // Check if the number is a multiple of 5
	            else if (i % 5 == 0) {
	                System.out.println("Buzz");
	            }
	            // If none of the above conditions are met, print the number itself
	            else {
	                System.out.println(i);
	            }
	        }
	}

}
