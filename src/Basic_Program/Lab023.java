package Basic_Program;
//			Java Multi-Dimensional Arrays
public class Lab023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println(myNumbers[1][2]);
	
		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]); 
		
		
		int[][] myNumber = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int i = 0; i < myNumber.length; ++i) {
		  for (int j = 0; j < myNumber[i].length; ++j) {
		    System.out.println(myNumber[i][j]);
		  }
		}
		
		
		int[][] myNum = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int[] row : myNum) {
		  for (int i : row) {
		    System.out.println(i);
		  }
		}
	}
	

}
