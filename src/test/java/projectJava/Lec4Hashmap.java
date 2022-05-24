package projectJava;

import java.util.HashMap;

public class Lec4Hashmap {

	public static void main(String[] args) {
		// to store paired value => key, value
		
		//HashMap<Integer, String> country = new HashMap<Integer, String>();
		//country.put(1,  "Banglagesh");
		
		// syntax of HasMap
		//HashMap<Integer, String> country = new HashMap<Integer, String>();
		//how to add in arraylist we use .add but hasmap we use.put
		//country.put(1, "bangladesh");
		
		HashMap<String, String> capitalcities = new HashMap<String, String>();
capitalcities.put("Bangladesh", "Dhaka");
capitalcities.put("Germany", "Berlin");
capitalcities.put("Norway", "Oslo");
capitalcities.put("USA", "Washington DC");

System.out.println(capitalcities);
	}
	

}
