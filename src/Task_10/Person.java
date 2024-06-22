package Task_10;

public class Person {
	String name = "Guvi";
	int age =10;
	
	//getter method for name
	public  String getName() {
		return name;
	}
	
	//getter method for age
    public int getAge()
    {
    	return age;
    }
	

    	public static void main(String[] args) {
    		
    		//creating object for class
    		Person obj = new Person();
    		//calling methods
    		obj.getName();
    		obj.getAge();
    		//printing values by calling getter method
    		System.out.println(obj.getName());
    		System.out.println(obj.getAge());
    		
    	}

}
