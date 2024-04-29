package Basic_Program;
// return value
public class Lab027 {

	static int method(int x) {
		return 5+x;
		
	}
	
	static int method1(int x, int y) {
		return x+y;
		
	}
	
	static int method2(int x, int y) {
		return x+y;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(method(3));//output 8(5+3)
			System.out.println(method1(3,5));//output 8(5+3)
			int z = method2(2,2); // output 4 (2+2)
			System.out.println(z);
	}

}
