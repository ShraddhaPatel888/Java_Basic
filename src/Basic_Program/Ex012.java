package Basic_Program;

public class Ex012 {

	public static void main(String[] args) {
		// new way to write a switch case
		  int itemCode = 004;
	        // JDK > 13

	        switch (itemCode) {
	            case 001 -> System.out.println("It's a laptop!"); // -> represent to break
	            case 002 -> System.out.println("It's a desktop!");
	            case 003, 004 -> System.out.println("It's a mobile phone!");
	            default -> System.out.println("Heloo!");
	        }

	        char ch = 'z';
	        switch (ch) {
	            case 'a', 'e', 'i', 'u', 'o' -> System.out.println("Vowel");
	            default -> System.out.println("Consonant");
	             // - >
	        }

	}

}
