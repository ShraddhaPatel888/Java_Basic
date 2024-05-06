package Basic_Program;

public class Ex021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "Shraddha"; //SCP
	        String s2 = new String("Shraddha"); // OA

	        // String  - Immutable -> Once created can't be changed.


	        StringBuffer stringBuffer = new StringBuffer("Shraddha");
	        stringBuffer.append("Patel");
	        stringBuffer.reverse();
	        System.out.println(stringBuffer);
	        // PramodDutta

	        StringBuilder stringBuilder = new StringBuilder("Shraddha");
	        stringBuilder.append("Patel");


	        String password = "pass@123";
	        password = "123";

	        // Mutable - that can be changed!!
	        StringBuilder password2 = new StringBuilder("Shraddha");
	        password2.append(" Patel");
	        System.out.println(password2);
	}

}
