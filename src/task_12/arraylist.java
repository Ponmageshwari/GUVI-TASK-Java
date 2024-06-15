package task_12;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create arraylist
		ArrayList<String> list = new ArrayList<String>();
		
		//Add elements to list
		list.add("Arun");
		list.add("Bose");
		list.add("jeeva");
		list.add("Rashmi");
		
		System.out.println("List before removing:");
		
		//iterate each element and printing
		for(String name : list) {
			
			System.out.println(name);
		}
		
		System.out.println("List after removing:");
		
		//remove all elements from list
		list.clear();
		
		System.out.println(list);
	}

}
