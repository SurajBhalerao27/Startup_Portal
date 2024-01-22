package oopsConcepts.inheritance;

/*
 * The reason for not allowing multiple inheritance in java is because of ambiguity error.
 * 
 * Ambiguitty error is when a class has two methods of the same signature , if this happens , then JVM gets 
 * Confused as to which method has to be called.
 * 
 * If a class is allowed to have multiple parents then there is a possibility that the parents have the same exact method 
 * and consecutively these same methods will be inherited HEnce multiple inheritance is not allowed in java.
 * 
 * 
 */
class C {
	public void display() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

	public void display(int a) {
	 	System.out.println("**************************************");
	}

	public void display(int a, String s) {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {

		C c = new C();
//		c.display(10);
//		c.display();
		c.display(0, "Suraj");
	}

}
