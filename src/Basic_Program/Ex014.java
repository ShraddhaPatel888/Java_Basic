package Basic_Program;

import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to Perform Arithmetic Operations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int input1 = sc.nextInt();
        System.out.println("Enter num2");
        int input2 = sc.nextInt();
        System.out.println("Enter Operation +,-,%,/,*");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (input1 + input2));
                break;
            case '-':
                System.out.println("Result: " + (input1 - input2));
                break;
            case '*':
                System.out.println("Result: " + (input1 * input2));
                break;
            case '%':
                System.out.println("Result: " + (input1 % input2));
                break;
            case '/':
                System.out.println("Result: " + (input1 / input2));
                break;
            default:
                System.out.println("Invalid operator");


        }

        sc.close();

	}

}
