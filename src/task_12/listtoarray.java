package task_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listtoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		//Add elements to list
		list.add("01");
		list.add("02");
		list.add("03");
		
		//Converting list to array
		String[] arr = list.toArray(new String[0]);
		//Converting array to string
		System.out.println(Arrays.toString(arr));

	}

}
