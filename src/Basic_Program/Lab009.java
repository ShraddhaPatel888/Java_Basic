package Basic_Program;
/*					Java Operators
 * 						Arithmetic operators(+,-,*,/,%,++,--)
						Assignment operators(=,+=,-=,*=,/=,%=&=,|=,^=,>>=,<<=)
						Comparison operators(==, !=, >, <, >=, <=)	
						Logical operators(&&, ||, !)
						Bitwise operators

 */

public class Lab009 {

	public static void main(String[] args) {
		// Arithmetic Operators
		System.out.println("------------Arithmetic Operators------------");
		// Addition "+"
		 int x = 5;
		 int y = 3;
		 System.out.println(x + y);
		 
		 //Incremental "++"
		 int x1 = 5;
		 ++x1;
		 System.out.println(x1);
		 
		 //Decrement "--"
		 int y1 = 5;
		 --y1;
		 System.out.println(y1);
		 
		 System.out.println("------------Assignment Operators------------");
		 //x+=3  -----> x=x+3
		 System.out.println("+=");
		 int z=5;
		 z+=3;
		 System.out.println(z);
		 
		 System.out.println("%=");
		 int s = 5;
		    s %= 3;
		    System.out.println(s);
		    
		System.out.println("&="); 
		int p = 5;
	    p= 3;
	    System.out.println(p);
	    
	    System.out.println("|="); 
	    int a = 5;
	    a |= 3;
	    System.out.println(a);
	    
	    System.out.println("^="); 
	    int e = 5;
	    e ^= 3;
	    System.out.println(e);
	    
	    System.out.println(">>="); 
	    int x5 = 5;
	    x5 >>= 3;
	    System.out.println(x5);
	    
		System.out.println("------------Comparision Operators------------");
	    
		 int x2 = 5;
		    int y2 = 3;
		    System.out.println(x2 > y2); // returns true because 5 is greater than 3
		    
			System.out.println("------------Logical Operators------------");
			int x3= 5;
		    System.out.println(x3 > 3 && x3 < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
	}

}
