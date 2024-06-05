package day8;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for a:"+" ");
		int a = sc.nextInt();
		System.out.println("Enter the value for b:"+" ");
		int b = sc.nextInt();
		
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.print("After swapping:"+ a + " " + b);
		
		

	}

}
