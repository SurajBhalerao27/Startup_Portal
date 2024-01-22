/*
   WAP to reverse the given number
*/
package practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n,rev=0,rem;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			n=sc.nextInt();
		}
		//        t=n;
        while(n>0) {
        	rem=n%10;
        	rev=rev*10+rem;
        	n=n/10;
        }
        System.out.print("Reverese Number is = "+rev);
	}

}
