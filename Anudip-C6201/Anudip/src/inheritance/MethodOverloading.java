package inheritance;
//loading=same class,and different parameter data type.
class Calculator{
	public void add() {
		
		System.out.println("This is addition method empty");
		
	}
public void add(int a,int b) {
		
		System.out.println("This is addition method\n" +a+b);
		
	}
public void add(String name,String surname) {
	
	System.out.println("This is addition method\n"+name+ surname);
	
}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(7, 9);
		c.add("chaitali","barhate");
		c.add();

	}

}
