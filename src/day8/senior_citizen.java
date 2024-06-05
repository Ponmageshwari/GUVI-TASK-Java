package day8;

import java.util.Scanner;

public class senior_citizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the citixen age:"+ " ");
		Scanner sc = new Scanner(System.in);
		int Citizen = sc.nextInt();
		
		if(Citizen>60) {
			
			System.out.println("He/She is a Senior citizen");
		}
		
		else {
			
			System.out.println("He/She is not a Senior citizen");
		}

	}

}
