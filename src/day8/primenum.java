package day8;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		boolean flag = true;
		for( int i = 2; i<=num; ++i) {
			
			if(num % 2 == 0 ) {
				
				flag = false;
				break;
			}
		}
		
		if(flag) {
			
			System.out.println(num + " is a prime number.");}
		
		    else {
		    	
		      System.out.println(num + " is not a prime number.");
		}

	}

}
