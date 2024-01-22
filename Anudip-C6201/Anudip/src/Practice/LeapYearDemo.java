package Practice;

import java.util.Scanner;
class Test3{
	
	public void check(int year) {
		
		 if (year % 4 == 0 ||(year % 400==0)){
	         System.out.println(+year+ "\nThis is year is a leap year");
		 }
	      else
	         System.out.println(+year+"\nThis is year is not a leap year");
		
	}
	
}

public class LeapYearDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);  
		System.out.println("Enter an Year:");
	    int year =sc.nextInt();
	    
	    Test3 t3=new Test3();
	    t3.check(year);
	}

}
