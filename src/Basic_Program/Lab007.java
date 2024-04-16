package Basic_Program;
/*					Java Characters
 * 			Characters char
 * 			Strings String
 */

public class Lab007 {

	public static void main(String[] args) {
		//  single character
		char myGrade = 'B';
		System.out.println(myGrade);
		
		//ASCII values
		System.out.println("--------------------------");
		System.out.println("ASCII values");
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.printf("ASCII value of 65 is %c",myVar1);
		System.out.println();
		System.out.printf("ASCII value of 66 is %c",myVar2);
		System.out.println();
		System.out.printf("ASCII value of 67 is %c",myVar3);
		System.out.println();
		
		//Strings
		System.out.println("--------------------------");
		System.out.println("String value");
		String greeting = "Hello World";
		System.out.println(greeting);
	}

}
