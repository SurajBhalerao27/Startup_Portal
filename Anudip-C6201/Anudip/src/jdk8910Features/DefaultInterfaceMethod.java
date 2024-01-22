package jdk8910Features;

/*
 * Upto java 8 we were able to make onlu abstract methods in an interfaces , due to which any class that implements
 * an interface had to give implementation to all the abstract methods.
 * 
 * but in jdk 8 the concept of default method had been introduced in java. now we can make methods by declaring it
 * with the keyword default.
 * 
 * any child class which implements the interfaces having default methods do not have to 
 * override the default method again.
 * 
 * */
interface Camera {
	public void clickPics();

	public void flash();

	default public void display() { // We can give abstract method body in interfaces by writing << default >> //
									// keyword
		System.out.println("Taking panoramic pics");
	}
//	public void panoroma(); 
	/*
	 * // if i trying to make one more method in interface then I have to give
	 * method // method body in class where it is implemented so, we make a method
	 * with body // itself in their only so it do not make us problem in future
	 * 
	 * this is the Java 8 JDK 8 feature.
	 */
}

class Gallery {
	public void savePics() {
		System.out.println("Saved the pic in gallery");
	}
}

class Nikon extends Gallery implements Camera {

	@Override
	public void clickPics() {
		// TODO Auto-generated method stub
		System.out.println("Clicking Pics");
	}

	@Override
	public void flash() {
		// TODO Auto-generated method stub
		System.out.println("Turning On Flash");
	}

}

public class DefaultInterfaceMethod {
	public static void main(String[] args) {
		Nikon nikon = new Nikon();
		nikon.clickPics();
		nikon.flash();
		nikon.display();
	}
}
