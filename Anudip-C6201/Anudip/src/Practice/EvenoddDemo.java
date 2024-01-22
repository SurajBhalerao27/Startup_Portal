package Practice;

import java.util.Scanner;

public class EvenoddDemo {
	public int evenodd(int number) {
      if (number%2==0) {
    	  System.out.println("Number is even:"+number);
    	  
    	  
      }
      else {
    	  System.out.println("Number is odd: "+number);
    	  
    	  
      }
      return number;
	} 
	public static void main(String [] args) {
		EvenoddDemo ed=new EvenoddDemo();
		Scanner sc = new Scanner (System.in);  
	      System.out.println("Enter the number for evenodd condition:"); 
	      int num =sc.nextInt();
		int number=ed.evenodd(num);
		
		
		
	}
}
