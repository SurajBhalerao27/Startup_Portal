package practice;

public class ConstructorChaining {
	private int value1;
	private int value2;
	private int value3;

	// First constructor
	public ConstructorChaining() {
		// Call the second constructor with default values
		this(25, 44);
		System.out.println("This is main constructor");
	}

	// Second constructor
	public ConstructorChaining(int value1, int value2) {
		// Initialize the instance variables
		this(88, 31, 96);
		this.value1 = value1;
		this.value2 = value2;
		System.out.println("Value 1 : " + value1);
		System.out.println("Value 2 : " + value2);
		System.out.println();
	}

	public ConstructorChaining(int value1, int value2, int value3) {
		// Initialize the instance variables
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		System.out.println("Value 1 : " + value1);
		System.out.println("Value 2 : " + value2);
		System.out.println("Value 3 : " + value3);
		System.out.println();
	}

	public class Main {
		public static void main(String[] args) {
			// Create an instance of ConstructorChaining using the default constructor
			ConstructorChaining myObject1 = new ConstructorChaining();
		}
	}
}
