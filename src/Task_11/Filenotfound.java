package Task_11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Filenotfound {

	public static void main(String[] args) {
	
		//try block
		try {
			
			//look for file in specified path
			FileOutputStream file = new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\src\\Task_20\\Test.txt");
		} 
		//catch block
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
