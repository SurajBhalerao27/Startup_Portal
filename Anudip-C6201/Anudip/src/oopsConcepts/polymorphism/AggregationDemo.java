package oopsConcepts.polymorphism;

class Drinks{
	public void coldDrinks(){System.out.println("This is the COCA COLA");}
	public void hotDrinks() {System.out.println("This is hot coffee");}
}
class Food {
	public void addSalt() {System.out.println();}
	public void addChutney() {System.out.println();}
	
	
}

class Cart {
	Food f= new Food();
	Drinks d = new Drinks();
}

public class AggregationDemo {

	public static void main(String[] args) {

		/*
		 * Inheritance shows --> IS-A relationship Here child is a type of parent
		 * 
		 * Aggregaion shows HAS-A relationship In this one class has a object of another
		 * class
		 * 
		 */
		
		Cart c = new Cart();
		c.f.addSalt();
		c.f.addChutney();
	}

}
