package abstraction;

/*
Abstraction is another pillar of opps concept.
if we want to declare abstract method then abstract class is compulsory. 

In java we achieve abstraction by making abstract method.
Abstract method do not have their own method body.They only have method signature.
These abstract method are given implementation/method body by child classes according to their requirement.


point to remember:
1)Abstract method has to be declared by using abstract keyword.
2)An abstract method can only made inside an abstract class,meaning if your class has an abstract method;
   it is compulsory to declare the class also abstract.
3)we cannot make the object of abstract class because our class is incomplete since it has abstract methods.
*
*
*
*
*
*/
abstract class Robot1 {

	public void talking() {

		System.out.println("The robot id coding...");

	}

	public void cleaning() {

		System.out.println("The robot is cleaning..");
	}

	public abstract void dancing();
}

class sanketrobot extends Robot1 {

	public void dancing() {

		System.out.println("My robot doing the break dance.");
	}
}

class pratimarobot extends Robot1 {
	public void dancing() {
		System.out.println("My robot doing the bharatnatym.");

	}

}

public class AbstractionDemo {

	public static void main(String[] args) {
		sanketrobot sr = new sanketrobot();
		sr.talking();
		sr.cleaning();
		sr.dancing();

		pratimarobot pr = new pratimarobot();
		pr.talking();
		pr.cleaning();
		pr.dancing();

	}
}
