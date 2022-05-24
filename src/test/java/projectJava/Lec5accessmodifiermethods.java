package projectJava;

public class Lec5accessmodifiermethods {


		// attribute
	//if write final can not change anything.
		final int a=10;
		String car="Nissan";
		
		//Syntax of method
		
		//accessmodifier returnType method name (){}
		
	public void facebooklogin() {
		// body of code
	}
	public void facebooksignup() {
		// body of code
	}
	// private mathod
	public void method() {
	
		//body
	}
	//default method
	void methodd() {
		//body
	}
	public static void main(String[] args)
	{
		//create object of the class
		//classname odject name of the class = new classname();
		
		Lec5accessmodifiermethods accessmodifier = new Lec5accessmodifiermethods();
		System.out.println(accessmodifier.car);
		
		accessmodifier.method();
		// changing the value 10 to 100
		//accessmodifier.a=100;
		System.out.println(accessmodifier.a);
		
	
	}
}


