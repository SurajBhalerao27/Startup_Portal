package Fundametal;
import java.util.Scanner;

public class SwapDemo {
	public static void main (String [] args) {
	
		Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the value of X and Y");  
    int x = sc.nextInt();  
    int y = sc.nextInt();  
    System.out.println("before swapping numbers: "+x +"  "+ y);  
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("swapping number:"+x);
	System.out.println("swapping number:"+y);
	
	
}
}
