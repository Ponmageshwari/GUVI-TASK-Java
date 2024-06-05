package day8;

public class Num_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0, num = 123452;

	    while (num != 0) {
	      
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
	}