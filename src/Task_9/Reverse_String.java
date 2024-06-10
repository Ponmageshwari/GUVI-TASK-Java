package Task_9;

import java.util.Scanner;

public class Reverse_String {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    //get input from user
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String:");
		  
		   //store the user input
		String st = sc.nextLine();
		String sr = "";
		
		   //reverse the string
		for(int i=st.length()-1;i>=0;i--) {
			
			 sr = sr+st.charAt(i);
		}
        
		   //printing reversed string
		System.out.println("Reversed String is:"+sr);
	}

}
