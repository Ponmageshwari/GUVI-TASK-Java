package Task_11;

import java.util.Scanner;

public class Login_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String username = "Admin";
		System.out.println(username);
		String password = sc.nextLine();
		 try {
			 
			 if(password.length()<=8) {
				 throw new LoginException("Password length should be 8"); 
			 }
		 }
		 catch(Exception e) {
				
			 System.out.println("password should be 8 characters");
		}
		 
		
	}

}
