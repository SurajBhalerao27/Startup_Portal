package Practice;

import java.util.Scanner;

public class ForDemo1 {
	
public static void main(String [] args) {

	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter your Number:");
     double num = sc.nextDouble();
 	int i=1;
	for(i=1;i<=20;i++) {
		
		double R=num*i;
		System.out.println("table of number:"+R);
		
		
	}
	
	
}
}
