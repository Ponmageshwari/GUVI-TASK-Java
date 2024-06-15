package task_12;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create treemap
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		//Add elements to map using put method
		map.put(01, "Arun");
		map.put(02, "Ajay");
		map.put(03, "Bavani");
		map.put(04, "catherine");
		map.put(05, "Dharshini");
		map.put(05, "rashmi");
		
		for(Map.Entry m : map.entrySet()) {
			
			//getvalues method returns only value of map
			System.out.println(m.getValue());
			
			
		}
	}

}
