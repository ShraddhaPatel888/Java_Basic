package Basic_Program;
/* 					Java Booleans
 * 						YES / NO
						ON / OFF
						TRUE / FALSE
					which can store true or false values.
 */

public class Lab012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);
		
		
		int x = 10;
		int y = 9;
		System.out.println(x > y); // returns true, because 10 is higher than 9
		
		System.out.println("For Age Program");
		int myAge = 25;
		int votingAge = 18;
		System.out.println(myAge >= votingAge);
		
		System.out.println("Age check::");
		int myAge1 = 25;
		int votingAge1 = 20;

		if (myAge1 >= votingAge1) {
		  System.out.println("Old enough to vote!");
		} else {
		  System.out.println("Not old enough to vote.");
		}
	}

}
