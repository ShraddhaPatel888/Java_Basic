package Basic_Program;
/*				Java Break and Java Continue
 * 					The break statement can also be used to jump out of a loop.
 * 					The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
 */
public class Lab016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i;
			for ( i = 0; i < 10; i++) {
				  if (i == 4) {
				    break;
				  }
				  System.out.println("Break command ->"+i); //0,1,2,3
				}
			System.out.println("\n");
			for (int j = 0; j < 10; j++) {
				  if (j == 4) {
				    continue;
				  }
				  System.out.println("Continue Command ->"+j); //0,1,2,3,5,6,7,8,9
				}
	}

}
