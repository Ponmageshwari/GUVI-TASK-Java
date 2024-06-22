package Task_11;

import java.util.Scanner;

public class UserDefined {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			if(age<18) {
				
				throw new InvalidAgeException("Age is less than 18");
			}
		}
			catch (Exception e) {
				System.out.println("Please enter age greater than 18");
			}
	}
}
