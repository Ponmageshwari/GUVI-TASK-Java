package Task_9;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "WOW";
		String rev="";
		
		//reverse the string
		
		for(int i = str.length()-1 ;i >= 0 ; i--) {
			
			rev=rev+str.charAt(i);
		}
		
		// matching string with reverse string
       if(str.equals(rev)) {
    	   
	    System.out.println("String is a Palindrome");
}
       else {
    	   
    	   System.out.println("String is not a Palindrome");
       }
	}

}
