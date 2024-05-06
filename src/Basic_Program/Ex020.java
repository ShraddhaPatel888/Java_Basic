package Basic_Program;

public class Ex020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 9},
	            {7, 8, 6}
	        };

	        int max = findMaxValue(arr);
	        System.out.println("Maximum value in the 2D array: " + max);
	    }

	    public static int findMaxValue(int[][] arr) {
	        int max = Integer.MIN_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                if (arr[i][j] > max) {
	                    max = arr[i][j];
	                }
	            }
	        }

	        return max;
	    }
	
	}


