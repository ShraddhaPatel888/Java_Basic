package Basic_Program;

import java.util.Scanner;

public class Ex024 {
	
					//Reverse a String without using any function or using for loop.
	
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter String that needs to be reversed:");
	        String s=sc.nextLine();
	        System.out.println("\nOriginal String: "+s);
	        System.out.println("Reversed String using recursive function: "+reversestring(s));

	        System.out.println("Reversing String via While");
	        int k=s.length()-1;
	        StringBuilder reverse=new StringBuilder();
	        while(k>=0){
	            reverse.append(s.charAt(k));
	            k--;
	        }
	        System.out.println("Reversed String:"+reverse.toString());
	        sc.close();
	    }

	    public static String reversestring(String str){
	        if(str == null || str.length()<=1){
	            return str;
	        }
	        return reversestring(str.substring(1))+str.charAt(0);
	        
	}

}
