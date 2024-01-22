/*
    2. WAP to check whether a given year is a  LEAP year
*/

package practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int year;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter year:");
			year=sc.nextInt();
		}
		if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0))
	    {
	        System.out.println("The year you entered is a LEAP YEAR");
	    }
	    else
	    {
	        System.out.println("The year is not a LEAP YEAR");
	    }
	}

}
