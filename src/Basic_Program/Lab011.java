package Basic_Program;
//				Java Math 
public class Lab011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=10;
		
		System.out.println("Max(25,10) value=>"+Math.max(a, b));
		System.out.println("Min(25,10) value=>"+Math.min(a, b));
		System.out.println("sqrt(25) value=>"+Math.sqrt(a));
		System.out.println("Absolute \"positive\" value display(-25.88) value=>"+Math.abs(-25.88));
		System.out.println("Display rendom number Math.rendom value=>"+Math.random());
		
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
	    System.out.println("Rendom number between 0 to 100 ==>"+randomNum);
	
	
	
	}

}
