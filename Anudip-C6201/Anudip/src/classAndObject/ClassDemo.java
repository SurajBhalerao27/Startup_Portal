package classAndObject;

/*constructor=It is a special method used to create object.
 * for constructor not required return type 
 * syntax of constructor:access specifier,name of constructors(must be same as class name)(parameter)
 * We can create the one or more constructors with different parameter. 
 * 
 */
public class ClassDemo {
	int a = 10;

	public String display(String b) {
		System.out.println("today is last day of our week:" + a);
		System.out.println("today is present:" + b);
		return "raksha badhan is coming";
	}

	public ClassDemo() {
		System.out.println("I am the constructor of class.");
	}

	public static void main(String[] args) {
		ClassDemo cd = new ClassDemo();
		String b = "chaitali";
		String S = cd.display(b);
	}
}
