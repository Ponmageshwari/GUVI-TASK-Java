package Task_9;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Getting input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number:");
		int n1 = sc.nextInt();
		
		System.out.print("enter the Second number:");
		int n2 = sc.nextInt();
		
		System.out.print("enter the Third number:");
		int n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			
			System.out.println("The largest Number is:"+n1);
		}
  
		if(n2>n3 && n2>n1) {
			
			System.out.println("The largest Number is:"+n2);
		}
		
		else {
			
			System.out.println("The largest Number is:"+n3);
		}
	}

}
