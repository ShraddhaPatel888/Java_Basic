package Basic_Program;

import java.util.Scanner;

public class Lab017 {

	public static void main(String[] args) {
		// Table program
		 
		Scanner sc= new Scanner(System.in);

	        System.out.print("Enter the table number: ");
	       
	        int num = sc.nextInt();
	    
		
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + "x"  + i  + " = " + (num*i));
	        }

	}

}
