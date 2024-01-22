package oopsConcepts.abstraction.interfaces;

/*  below we are seeing that the variables are automaticallu considered as public static and final, we don't
 *  have to use the specific keuwords to make them so.
 */
interface Demo2 {
	int i = 100;
	String name = "suraj";
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		System.out.println("i= " + Demo2.i);
//		Demo2.i = 200;    // here getting an error bcoz by default the inteface is ( static, final, public)

		System.out.println("Variable i in Demo2: " + Demo2.i); // here i acces the variable coz it is public.
		/*
		 * Demo2 d = new Demo2.;
		 * 
		 * As we seen above we will never be able to create the object of an interface
		 * 
		 */

	}
}
