package Practice;

import java.util.Scanner;

public class PositiveornegativeDemo {

	public int positiveornegative(int num) {
	 if(num>0) {
		 
		 System.out.println("Number is positive");
		 
	 }
	 else
	 {
		 
		 System.out.println("Number is negative"); 
		 
	 }
	 return num;
	 
 } 
 
 
 
 
 public static void main(String [] args) {
	 PositiveornegativeDemo pd=new PositiveornegativeDemo();

		Scanner sc = new Scanner (System.in);  
	      System.out.println("Enter the number for PositiveorNegative:"); 
	      int num =sc.nextInt();
	      int n1=pd.positiveornegative(num);
	 System.out.println("Number is" +n1);
 }
}
