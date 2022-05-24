package projectJava;

import java.util.ArrayList;

public class Lec3Arraylist {

	public static void main(String[] args) {
		//ArrayList<datatype>veriable name=new ArrayList<datatype>();
		
ArrayList<String>Sportscars = new ArrayList<String>();
//add value
Sportscars.add("bmw");
Sportscars.add("nissan");
Sportscars.add("lexus");
Sportscars.add("acura");

//access
//Sportscars.get(1);
//System.out.println(Sportscars.get(1));

//change of value

//Sportscars.set(1, "brently");

// to delete value
//Sportscars.remove(0);
//print everything using forloop
for(int i=0; i<Sportscars.size();i++ ) {
System.out.println(Sportscars.get(i));
}

	}

}
