package Task_11;

import java.util.Scanner;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a: ");
	    int a = sc.nextInt();
		System.out.println("Enter value for b: ");
		int b = sc.nextInt();
		int c ;		

        //try block
		try {
			c = a/b;
			//arr[1]=c;
			//int len = word.length();
			
			
		} 
		
		//catch block
		catch (ArithmeticException e) {
			c = a /1;
			System.out.println("Since the value of b was 0, assigning a default value as 1");
	}

}
}
