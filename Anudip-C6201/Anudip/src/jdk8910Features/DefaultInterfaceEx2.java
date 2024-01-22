package jdk8910Features;

/* 
 * Multiple inheritance with interfaces is allowed but if all the interfaces implemented by a class has the excat same 
 * as default method with exact same method signature then it make compulsory to class to override the method and 
 * give its own implementation.
 * 
 */
interface Tempplate1 {
	default public void addToCart() {
		System.out.println("Product add temp1");
	}
}

interface Tempplate2 {
	default public void addToCart() {
		System.out.println("Product add temp2");
	}
}

class Amazon implements Tempplate1, Tempplate2 {
	@Override
	public void addToCart() {
		System.out.println("Product added to cart in amazon");
	}
}

public class DefaultInterfaceEx2 {
	public static void main(String[] args) {

	}
}
