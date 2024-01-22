package oopsConcepts.polymorphism;

/*Method overiding is th eprocess of changing the behaviour of the inherited method in the child class
 * 
 * Polymorphism is same name diffeent behaviour. Polt menas many and morph is form.
 * Types of pylymorphism
 * 1. Method overriding 
 * 2. Method overloading
 * 
 * Steps for method overriding :
 * 
 * Method overriding is a concept of polymorphism.
 * 1) make exact same method in the child class as it was in parent class
 * 2) Do not change the method name and the method parameter
 * 3) access specifier can be changed but you can not reduce the visibility in the child class.
 * 4) private methods are never inherited by child class, hence we cannot override private method. We can make same
 * method in child class also but it will be considered as a new method belonging to child class. THis mehtod will
 * not be connected to the parent class method.
 * 
 *  Access Specifiers Hierarchy
 *      public   			--> This is accesible publically        
 *      protected			--> 
 *      default				--> 
 *      private				--> This is only accesible within same class
 *      
 *      
 * */
class Parent {
	void sendResume() {
		System.out.println("Sending Resume By Post...");
	}

	// if I used <<private>> here so this method cannot be inherited in below child class.
	private void display() {
		System.out.println("Hello");
	}
}

class Child extends Parent {
	public void sendResume() {
		System.out.println("sending resume by E mail...");
	}
	
	public void display() {
		System.out.println("*****************");
	}
	
	public void show() {
		System.out.println("Today is monday");
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		Child c = new Child();
		c.sendResume();
//		c.sendResume("s");
	}
}
