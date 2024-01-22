package Practice;
import java.util.Scanner;
public class ReverseDemo {
	public int reverse(int num) {
		 int reverse=0; 
		for(;num != 0;)   
		{  
		 int remainder = num % 10;  
		 reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		return reverse;
		
		
	}
	public static void main(String[] args)   
	{  
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your Number for reverse:");
	     int num = sc.nextInt();
	     ReverseDemo rd=new ReverseDemo();
	     int result=rd.reverse(num);
	System.out.println("The reverse of the given number is: " +result);  
	}  
}
