package Basic_Program;

public class Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int a = 48;
	        int b = 2;
	        int c = 15;
	        
	        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	        
	        System.out.println("Maximum of the three numbers is: " + max);

	}

}
