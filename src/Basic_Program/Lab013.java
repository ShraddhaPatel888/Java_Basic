package Basic_Program;
/*						Java If ... Else
 * 						Syntax::
 * 							if (condition) {
  									// block of code to be executed if the condition is true
									}		
 */

public class Lab013 {

	public static void main(String[] args) {
		// Example of if Statement
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
		//Example of if....else Statement
		
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
		
		// Example of else if Statement
		
		int time1 = 22;
		if (time1 < 10) {
		  System.out.println("Good morning.");
		} else if (time1 < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		
		

	}

}
