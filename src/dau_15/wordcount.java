package dau_15;

import java.util.HashMap;
import java.util.Map;

public class wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome Welcome to java Guvi Guvi";
		
		String[] str1= str.split(" ");
		
		Map<String,Integer> m= new HashMap<String,Integer>();
		for(String str2 : str1)
		{
			if(!m.containsKey(str2)) {
				m.put(str2,1);
			}
			else {
				int count = m.get(str2);
				m.put(str2,count+1);
			}
		}
		System.out.println(m);
	}

}
