package Fundametal;
import java.util.Scanner;

public class ScannerDemo2 {
	public static void main (String [] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name:");
		 String name=sc.nextLine();
  
		  System.out.println("Enter your Mark:");
		   double marks=sc.nextDouble();
		 
		 System.out.println("enter if your fresher n or not:Answer in ture or false:");
		 boolean fresher=sc.nextBoolean();
				 
				 
		System.out.println("enter your mobile number:");
		 long contact=sc.nextLong();
		
		 
		 System.out.println("************************view the detail****************");
		 System.out.println("name:"+name);
		 System.out.println("mark:"+marks);
		 System.out.println("fresher or not:"+fresher);
		 System.out.println("contact:"+contact);
	}
}
