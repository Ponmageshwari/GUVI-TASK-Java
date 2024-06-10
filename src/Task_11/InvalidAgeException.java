package Task_11;

import java.util.Scanner;

public class InvalidAgeException {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			if(age<18) {
				
				//throw new UserDefined("Age is below than 18");
			}
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


