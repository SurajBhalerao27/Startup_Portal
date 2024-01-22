/*
  WAP to find the factorial of a number?
*/
package practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,fact=1;
		try (var sc = new Scanner(System.in)) {
			System.out.println("Enter Number: ");
			n=sc.nextInt();
		}
		for (i = 1; i <= n; i++)
		    {
		       fact= fact*i;
		    }
		System.out.println("Factorial is ="+fact);
	}

}
