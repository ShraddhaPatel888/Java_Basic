package Basic_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		// Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Input size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        
	        // Create array to store user input
	        int[] inputArray = new int[size];
	        
	        // Input values from user
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            inputArray[i] = scanner.nextInt();
	        }
	        
	        // Double the array
	        int[] doubledArray = doubleArray(inputArray);
	        
	        // Print the input and output arrays
	        System.out.println("\nInput array: " + Arrays.toString(inputArray));
	        System.out.println("Doubled array: " + Arrays.toString(doubledArray));
	        
	        scanner.close();
	    }
	    
	    // Function to double an array
	    public static int[] doubleArray(int[] array) {
	        int[] doubledArray = new int[array.length];
	        for (int i = 0; i < array.length; i++) {
	            doubledArray[i] = array[i] * 2;
	        }
	        return doubledArray;

	}

}
