package Basic_Program;
// 				Java String

public class Lab010 {

	public static void main(String[] args) {
		String greeting = "Hello! I am Shraddha Patel";
		
		System.out.println("Simple string");
		System.out.println(greeting);
		
		System.out.println("Stirng Length");
		System.out.println("The length of the string is: " + greeting.length());

		System.out.println("To Uppercase");
		System.out.println(greeting.toUpperCase());
		
		System.out.println("To Lowercase");
		System.out.println(greeting.toLowerCase());
		
		System.out.println("Finding a Character in a String");
		System.out.println(greeting.indexOf("Shraddha"));
		
		System.out.println("String Concatinatoin");
		
		// with + Operator
		String fName = "Shraddha";
		String lName = "Patel";
		System.out.println(fName + " " + lName);
		
		
		//with concat(); method
		String firstName = "Shraddha ";
	    String lastName = "Patel";
	    
	    System.out.println(firstName.concat(lastName));
	    
	    String txt = "We are the so-called \"Vikings\" from the north.";
	    System.out.println(txt);
	    
		
	}

}
