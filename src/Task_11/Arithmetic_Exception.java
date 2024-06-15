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
		int c =0;		

        //try block
		try {
			c = a/b;	
			
		} 
		
		//catch block to handle arithmetic exception
		catch (ArithmeticException e) {
			c = a /1;
			System.out.println("Value of b was 0");

}
}
}
