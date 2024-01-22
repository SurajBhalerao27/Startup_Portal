/*
    WAP to find whether a given number is an Armstrong number
*/
package practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,r,s=0,t;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Number:");
			n=sc.nextInt();
		}
		t=n;

		while(n>0) {
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		if(t==s) {
			System.out.print("Armstrong Number");
		} else {
			System.out.print("Not Armstrong Number");
		}
	}

}
