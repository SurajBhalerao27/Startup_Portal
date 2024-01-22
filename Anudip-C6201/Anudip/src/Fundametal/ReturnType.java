package Fundametal;
/*return type=void,int,double,float,long,charater.
 * catching is very improtant.
 * 
 * 
 */
import java.util.Scanner;
public class ReturnType {
	
	public void display() {
		
		System.out.println("this is the display.it will not return anything.");
		
	}
	public int add() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1=sc.nextInt();
		
		System.out.println("enter the Second number:");
		int num2=sc.nextInt();
		int total=num1+num2;
		
		 return total;
		
	}
	
public static void main(String[]args) {
	ReturnType rt=new ReturnType();
	rt.display();
	
	int Result=rt.add();
	System.out.println("result:"+Result);
	
	
}
}
