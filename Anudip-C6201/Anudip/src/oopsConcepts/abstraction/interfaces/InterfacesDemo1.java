/*
 * Interfce is a template for a class. We use it to create a basic structure for the class
 * 
 * Note to remember : 
 * 1) All methods in the interface are automatically considered as public and abstract, we do not have to add 
 * 	  the keyword public an dabstract agian and again in the code or in the methods.
 * 2) All variables int the interfaces are automatically public static and final
 * 
 * 3) Interfaces oobjects cannot be created. --->> Because it is abstract methods means incomplete methods
 * 	  
 * 4) Interfaces do not have constructors. Constructors basically are used to create object and to initialize
 * 	  the instance variable. since we cannot make the object of interfaces and we cannot initializes final 
 * 	  variable through constructors hence there is no requirement of constructors in interfaces. Therefore the
 * 	  concept of constructors are not allowed in interfaces.
 * 5) We use inplements keyword to make a IS-A relationaship between class and interfaces
 * 6) Interface can never extends another class, it can extend another interface.
 * 7) A class can implements more than one interface.
 * 8) A class can do both extend another class and implements many interfaces at the same time.
 * 9) We can make nested interfaces also
 * 10) If in case class does not want to implements all the methods of an interface then the class has to
 * 		declare itself as abstract. 
 * */
package oopsConcepts.abstraction.interfaces;

interface ClothingApp {
	String addToCart(String s);

//	ClothingApp(){  interfaces can not have constructors
//		
//	}
	double couponCode(double code);
}

class Suraj implements ClothingApp {
	// to use the interfaces we use implemets keyword.

	/**/
	@Override
	public String addToCart(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double couponCode(double code) {
		// TODO Auto-generated method stub
		return 0;
	}

}


public class InterfacesDemo1 {
	public static void main(String[] args) {
//		Suraj s = new Suraj();
//		System.out.println(s.addToCart("S"));
	}
}
