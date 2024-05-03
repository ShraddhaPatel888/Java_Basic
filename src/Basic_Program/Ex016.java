package Basic_Program;

import java.util.Scanner;

//			Create a Program which takes arrays and print all the marks.
public class Ex016 {

	public static void main(String[] args) {
		
		// Create a Program which takes arrays and print all the marks.
		
		Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of marks
        System.out.print("Enter the number of marks: ");
        int numMarks = scanner.nextInt();
        
        // Create an array to store the marks
        int[] marks = new int[numMarks];
        
        // Input marks from the user
        System.out.println("Enter the marks:");
        for (int i = 0; i < numMarks; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        // Print all marks
        System.out.println("Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }
        
        scanner.close();

	}

}
