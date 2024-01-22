/*Write a program where a car can run on different types of fuels*/
package polymorphisms;

class Car {
	public void fuel() {
		System.out.println("This is run on Petrol by default");
	}

	public void fuel(String fuel) {
		System.out.println("This is run on: " + fuel);
	}
}

public class MethodOverloadingPract {

	public static void main(String[] args) {
		System.out.println("Your car is Shift Dsire\nand");
		Car car = new Car();
		car.fuel("CNG");
	}

}
