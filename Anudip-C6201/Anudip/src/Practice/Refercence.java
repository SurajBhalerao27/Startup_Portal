package Practice;

public class Refercence {
int num=100;
static int num2=19;


public void display() {

	System.out.println("num1:"+num);
	System.out.println("num2:"+num2);
	
	
}


public static void main(String []args)
{
	Refercence r=new Refercence();
	System.out.println("num1:"+r.num);
	System.out.println("num2:"+num2);
	r.display();



}
}
