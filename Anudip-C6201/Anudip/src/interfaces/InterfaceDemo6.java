package interfaces;

interface Myinter {
	public void display();

	public void show();
}
/*
 * In below given MyClass we have not given method body/ implementation to the show method.
 * Meaning the show method inherited from MyInter is being kept as it is and would be abstract
 * 
 * We already know that any class having abstract method has to be declared as abstract, therefore we will have
 * to make MyClasss also abstract.
 * */
abstract class Myclass implements Myinter {  
	/*abstract class meaning this class have some un implemented method
	in this class
*/

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}

public class InterfaceDemo6 {
	public static void main(String[] args) {

	}
}
