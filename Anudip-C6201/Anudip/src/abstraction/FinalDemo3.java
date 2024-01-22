package abstraction;
/*
 * if we are declare final class then we can inheritance it.
 * 
 * A final class never be a super class.
 *
 */
final class Demo3{
	
	String name="chaitali";
	int id=500;
	
	public void display() {
		
		System.out.println("Hello Everyone!!");
	}
	
	
	
}
/*class SubDemo extends Demo3{
	
	
}

*/
public class FinalDemo3 {
public static void main(String[] args) {
	Demo3 d=new Demo3();//we can create a object of final class but we can not create object of abstract class
	
	d.display();
	d.id=600;
}
	
	
	
}
