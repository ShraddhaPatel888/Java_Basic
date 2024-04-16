<<<<<<< HEAD
package Basic_Program;
		/* Java Variables
		 * Syntax :: type variableName = value;
		 * Final Variables : If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
		 * 
		 * 
		 * String - stores text, such as "Hello". String values are surrounded by double quotes
		 * int - stores integers (whole numbers), without decimals, such as 123 or -123
		 * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		 * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		 * boolean - stores values with two states: true or false
		 * 
		 * int myNum = 5;
		 * float myFloatNum = 5.99f;
		 * char myLetter = 'D';
		 * boolean myBool = true;
		 * String myText = "Hello"

		 */
public class Lab003 {

	public static void main(String[] args) {
		// Create a variable called name of type String and assign it the value "Shraddha"
		String name = "Shraddha";
		System.out.println(name);
		System.out.println("----------------------------");
		
		//Create a variable called myNum of type int and assign it the value 15
		
		int myNum = 15;
		System.out.println(myNum);
		System.out.println("----------------------------");
		
		//You can also declare a variable without assigning the value, and assign the value later
		int myNum1;
		myNum1 = 15;
		System.out.println(myNum1);
		System.out.println("----------------------------");
		
		//Change the value of myNum from 15 to 20
		int myNum3 = 15;
		myNum3 = 20;  // myNum is now 20
		System.out.println(myNum3);
		System.out.println("----------------------------");
		
		/*Final Variables
		 * If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
		
		final int myNum4 = 15;
	    myNum4 = 20; // will generate an error
	    System.out.println(myNum4);  */ 
		
		//Display Variables
		System.out.println("Display Variables Start form here");
	    String name1 = "Shraddha";
	    System.out.println("Hello " + name1);
	    System.out.println("----------------------------");
	    System.out.println("----------------------------");
	    String firstName = "Shraddha ";
	    String lastName = "Patel";
	    String fullName = firstName + lastName;
	    System.out.println(fullName); 
	    System.out.println("----------------------------");
	    System.out.println("----------------------------");
	    int x = 5;
	    int y = 6;
	    System.out.println(x + y);
	    System.out.println("----------------------------");
	    System.out.println("----------------------------");
	    
	    //Declare Many Variables
	    System.out.println("Declare Many Variables");
	    int x0 = 5;
	    int y0 = 6;
	    int z0 = 50; //int x = 5, y = 6, z = 50;
	    System.out.println(x0 + y0 + z0);
	    System.out.println("----------------------------");
	    
	}

}
=======
package Basic_Program;
		/* Java Variables
		 * Syntax :: type variableName = value;
		 * Final Variables : If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
		 * 
		 * 
		 * String - stores text, such as "Hello". String values are surrounded by double quotes
		 * int - stores integers (whole numbers), without decimals, such as 123 or -123
		 * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		 * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		 * boolean - stores values with two states: true or false
		 * 
		 * int myNum = 5;
		 * float myFloatNum = 5.99f;
		 * char myLetter = 'D';
		 * boolean myBool = true;
		 * String myText = "Hello"

		 */
public class Lab003 {

	public static void main(String[] args) {
		// Create a variable called name of type String and assign it the value "Shraddha"
		String name = "Shraddha";
		System.out.println(name);
		System.out.println("----------------------------");
		
		//Create a variable called myNum of type int and assign it the value 15
		
		int myNum = 15;
		System.out.println(myNum);
		System.out.println("----------------------------");
		
		//You can also declare a variable without assigning the value, and assign the value later
		int myNum1;
		myNum1 = 15;
		System.out.println(myNum1);
		System.out.println("----------------------------");
		
		//Change the value of myNum from 15 to 20
		int myNum3 = 15;
		myNum3 = 20;  // myNum is now 20
		System.out.println(myNum3);
		System.out.println("----------------------------");
		
		/*Final Variables
		 * If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
		
		final int myNum4 = 15;
	    myNum4 = 20; // will generate an error
	    System.out.println(myNum4);  */ 
		
		//Display Variables
		System.out.println("Display Variables Start form here");
	    String name1 = "Shraddha";
	    System.out.println("Hello " + name1);
	    System.out.println("----------------------------");
	    System.out.println("----------------------------");
	    String firstName = "Shraddha ";
	    String lastName = "Patel";
	    String fullName = firstName + lastName;
	    System.out.println(fullName); 
	    System.out.println("----------------------------");
	    System.out.println("----------------------------");
	    int x = 5;
	    int y = 6;
	    System.out.println(x + y);
	    System.out.println("----------------------------");
	    System.out.println("----------------------------");
	    
	    //Declare Many Variables
	    System.out.println("Declare Many Variables");
	    int x0 = 5;
	    int y0 = 6;
	    int z0 = 50; //int x = 5, y = 6, z = 50;
	    System.out.println(x0 + y0 + z0);
	    System.out.println("----------------------------");
	    
	}

}
>>>>>>> a70a5ff61c57e07f628f40c4e3245b50c2834692
