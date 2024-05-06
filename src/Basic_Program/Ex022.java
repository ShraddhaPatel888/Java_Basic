package Basic_Program;

import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Palindrome - String
        // naman -> reverse  -> naman
        // 1331 -> 1331
        // Malaylam - Palindrome
        // Madam  true, mom

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String, I will check if it is Palindrome or not");
        String user_input = s.next();

        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome -> "+ user_input);
        }else{
            System.out.println("Nope!!");
        }

        s.close();
        //revser_String with using rever fucntio
	}

}
