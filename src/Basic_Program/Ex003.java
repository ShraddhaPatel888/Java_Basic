package Basic_Program;

public class Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
        float y = 12.4f;
        float z = 56.78f;
        double result =  Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
      
        System.out.println(result);
	}

}
