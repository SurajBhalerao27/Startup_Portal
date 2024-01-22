package oopsConcepts.polymorphism;

class Parent1{
	public void display() {System.out.println();}
	public void show() {System.out.println();}
}
class Child1{
	public void drawing() {System.out.println();}
	public void play() {System.out.println();}	
}
public class DoowncastingDemo1vv {

	public static void main(String[] args) {
		/*below we are seeing downcastign where the object of parent class is reffered by a child type variable
		 * 
		 * This is not allowed in java.
		 * 
		 * Here we are trying to make the parent behave like the child. which is not logical and hence this
		 * is not possible.
		 * */
		
		
		//		Child1 c = new Parent();
	}

}
