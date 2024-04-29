package Basic_Program;
//				Java Arrays

public class Lab022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		
		cars[0] = "Opel";
		System.out.println(cars[0]);
		
		System.out.println(cars.length);
		
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
		
		String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : car) {
		  System.out.println(i);
		}
	}

}
