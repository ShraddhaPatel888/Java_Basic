package Basic_Program;
//A Method with If...Else
public class Lab028 {
	
	  // Create a checkAge() method with an integer variable called age
		  static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!");

		    // If age is greater than, or equal to, 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!");
		    }

		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(20);
	}

	

}
