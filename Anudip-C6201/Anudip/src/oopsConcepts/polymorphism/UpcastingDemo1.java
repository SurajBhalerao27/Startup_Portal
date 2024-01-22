package oopsConcepts.polymorphism;

/* Upcasting is done to make child class object behave like a parent.
 * We do it by making a child class object and reffereing it with parent type variable.
 * By doing this now we will be able to call only those methods which the child has inherited from the parent
 * any method that the child class has of its own, will not be called.
 * 
 * */
class LivingThings {
	public void movement() {
		System.out.println("This being is moving");
	}

	public void growing() {
		System.out.println("The plant / animals are growing");
	}

	public void excreation() {
		System.out.println("The plants/animals are excreting");
	}

}

class Birds extends LivingThings {
	public void layingEggs() {
		System.out.println("The bird is laying eggs");
	}

	public void movemment() {
		System.out.println("The bird is moves by wlaking , hoping, crawling and flying");
	}

	public void hunting() {
		System.out.println("The bird is hunting");
	}

	public void buildingNest() {
		System.out.println("The bird is bulding nest");
	}
}

public class UpcastingDemo1 {

	public static void main(String[] args) {
		Birds bird = new Birds();
		bird.layingEggs();
		bird.excreation();
		// bird is the refference variable which is pointing to the memory location
		// where the object of Birds class made.

		/*
		 * Below we are seeing upcasting , here we are making the object of child class
		 * and reffering it with a variable of the parent type.
		 */
		// This is upcasting --> reffers to parent class by child class object

		// Why to use this ??
		/*
		 * Ans : to concentrate only on the inherited method and do not on the child
		 * class methods. It is helps us to see just parent class methods that are
		 * inherited.
		 */
		LivingThings l = new Birds();
		l.movement();
		// I didnt able to call the child class methods.
		l.growing();
		l.excreation();
		/*
		 * l.layingEggs();
		 */
	}

}
