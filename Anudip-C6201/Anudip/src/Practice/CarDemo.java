package Practice;

class Car{
	private int carId;
	private String engineType;
	private String color;
	private String brand;
	
	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	public void setcolor(String subject) {
		this.color = subject;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String toString() {
		return "Car Specifications of Mahindra Thar:\ncarId=" + carId + "\nengineType=" + engineType + "\ncolor=" + color + "\nbrand=" + brand ;
	}

	
}

public class CarDemo {

	public static void main(String[] args) {
		Car c=new Car();
		c.setCarId(1234);
		c.setcolor("Black");
		c.setEngineType("Petrol");
		c.setBrand("Mahindra Thar");
		 
		String result=c.toString();
		
		System.out.println(result);

	}

}
