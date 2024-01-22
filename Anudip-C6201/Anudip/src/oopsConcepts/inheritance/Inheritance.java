/*
 * Java follow oops concepts.
 * 
 * Main Pillars of OOPs 1) Inheritance 2) Abstraction 3) Polymorphism
 * 4)Encapsulation
 * 
 * 1) Inheriitance --> It is the process of inheriting the number if another
 * class into our class. This is done by making our class the child / sub class
 * of another.
 *  By using <<extends>> keyword we can inherits the parent class methods and fiels         to the child class
 *  It is uses the code reusability feature.
 *  extends is a keyword used to make our class is a child class.
 *  
 *  Note**  extends keyword followed by only one class name. 
 *  
 *  multiple inheritance is not allowed in java (ambiguity --> confusion happens)
 *  
 *  we can make only one parent class. we can not make multiple classes as parent class
 *  
 *  
 *  Types of inheritance--
 *  1) single inheritance : one parent and one child class
 *  2) Multi level inheritance : one parent has one child class and this child class is parent to another child class.
 */
package oopsConcepts.inheritance;

// This is SINGLE INHERITANCE
class MobileApp {
	public void textMessage() {
		System.out.println("Sending text message...");
	}

	public void voiceCall() {
		System.out.println("Voice call connecting ...");
	}
}

class MyApp extends MobileApp {
	public void videoCall() {
		System.out.println("Video call starting...");
	}

}

public class Inheritance {
	public static void main(String[] args) {
		MyApp m = new MyApp();
		m.textMessage();
		m.videoCall();
		m.voiceCall();
	}
}
