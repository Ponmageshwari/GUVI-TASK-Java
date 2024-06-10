package Task_9;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter Student Score:");
		
		int grade = sc.nextInt();
		
		
		if(grade>=90 && grade<=99) {
			
			System.out.println("Grade is A");
		}
		else if(grade>=80 && grade<=89) {
			
			System.out.print("Grade is B");
			
			}
		else if(grade>=70 && grade<=79) {
			
			System.out.print("Grade is c");
		}
		else if(grade>=60 && grade<=69) {
			
			System.out.print("Grade is D");
		}
		else if(grade>=50 && grade<=59) {
			
			System.out.print("Grade is E");
		}
		else if(grade <50) {
			
			System.out.print("Grade is F");
		}
		
		else if(grade == 100) {
			
			System.out.print("Grade is S");
			
		}
		
		else {
			
			System.out.println("Invalid Input");
		}

	}

}
