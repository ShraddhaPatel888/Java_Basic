package Basic_Program;
/*						Java Short Hand If...Else (Ternary Operator)
 * 							Syntax
 * 									variable = (condition) ? expressionTrue :  expressionFalse;
 */
public class Lab014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}

}
