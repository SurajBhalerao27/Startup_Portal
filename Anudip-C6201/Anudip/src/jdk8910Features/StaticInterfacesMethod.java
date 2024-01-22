package jdk8910Features;

/* 
 * 
 * 
 */
interface Calculator {
	default public void sub(int a, int b) {
		System.out.println("Answer is : " + (a - b));
	}

	public static void add(int i, int j) {
		/*
		 * If we are making methods in the interfaces then how we should call in the
		 * main method ??
		 * 
		 * for that we have to make separate child class for it and implemets that
		 * interface so that by making obj of this class we can call the method,,, but
		 * if we dont wants to implements the interface in the child class then we can
		 * make the methods by the keyword <<static>> so that we can call method
		 * directly.
		 * 
		 * 
		 */
		System.out.println("Answer is : " + (i + j));
	}

}

class Demo implements Calculator {

}

public class StaticInterfacesMethod {
	public static void main(String[] args) {
//		StaticInterfacesMethod s = new StaticInterfacesMethod();
		Demo demo = new Demo(); // here we needed to make a child class obj and then call the method in the
								// interface by the obj of it.
		demo.sub(50, 20);

		/*
		 * Below we are directly calling add() method without using any objects because
		 * add() method is static methods
		 */
		Calculator.add(50, 20); // and here we directly calls the method.

	}
}
