package abstraction;
/*
 * final keyword is used to make final meaning its value or behavior 
 * cannot be changed once it is declared final.
 * 
 * 
 * 
 * 
 */
class Demo1{
	
	int i=100;
	int j=200;
	
	public void display() {
		
		i=200;
		j=300;
		
	}
	
	
}
public class FinalDemo1 {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		//d1.i=100;
		d1.j=399;

	}

}
