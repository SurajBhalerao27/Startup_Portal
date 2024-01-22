package inheritance;

class Vehicle{
	
	public Vehicle() {
		
		System.out.println("This is non parameterized constructor of vehicle..");
	}
	public Vehicle(String type) {
		
		System.out.println("This is single parameterized constructor of vehicle..");
		
	}
	public Vehicle(int size,int capacity) {
		
	System.out.println("This is double parameterized constructor of vehicle  ");
	}
}
class Car4 extends Vehicle{
	
	public Car4(){
		
		System.out.println("This is non parameterized constructor of car.");
	}
	public Car4(int mno) {
		super(6,9);
		System.out.println("This is single parameterized constructor of car..");
		
	}
}
public class SuperTask {

	public static void main(String[] args) {
		Car4 c=new Car4(123);
		

	}

}
