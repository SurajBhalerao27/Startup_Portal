package Fundametal;

public class StaticVariable {
	int num=100;
	static int num2=1300;//memory is allocated when class load.for static member not required object. 
	
	public static void main (String[] args) {
		StaticVariable sv=new StaticVariable();
		
		System.out.println("num1:"+sv.num);
		System.out.println("num2:"+num2);
		sv.display();
	} 
    public void display() {

		System.out.println("num1:"+num);
		System.out.println("num2:"+num2);
    	
    	
    }
 }
