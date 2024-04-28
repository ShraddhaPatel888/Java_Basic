package Basic_Program;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		//   //Triangle Classifier:
        //
        //   Write a program that classifies a triangle based on its side lengths.
        //   Given three input values representing the lengths of the sides, determine

        //   if the triangle is equilateral (all sides are equal),
        //   isosceles (exactly two sides are equal), or
        //   scalene (no sides are equal).
        //   Use an if-else statement to classify the triangle.

        // side1, side2, side3 ->

		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the length of side a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Enter the length of side b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Enter the length of side c: ");
	        double c = scanner.nextDouble();

	        String triangleType = classifyTriangle(a, b, c);
	        System.out.println("The triangle is a " + triangleType);

	        scanner.close();
	    }

	    public static String classifyTriangle(double a, double b, double c) {
	        if (a == b && b == c) {
	            return "Equilateral Triangle";
	        } else if (a == b || b == c || a == c) {
	            return "Isosceles Triangle";
	        } else {
	            return "Scalene Triangle";
	        }
	}

}
