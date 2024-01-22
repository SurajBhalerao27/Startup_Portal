package abstraction;
/*
 * final method =we are not able to override this method is final and this child class has to use it us 
 * it has been inherited.
 * meaning final method behavior cannot be changed by overriding.
 * 
 * 
 * 
 */
abstract class Demo{
	
	public void show()   /// we can not use abstract keyword and final keyword together.
	{
		System.out.println("Hi!I am show method!!");
		
	}	
}
class Demo2{ //extends Demo{
	
	/*public void show()
	{
	for(int i=1;i<=10;i++){
		System.out.println("i");
		}
	}	
	 * 
	 * 
	 * 
	 */
	
}


public class FinalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
