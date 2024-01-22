/*
    WAP to check whether a person is eligible for voting
*/
package practice;

public class Voting {

	public static void main(String[] args) {
		int age;
		age=Integer.parseInt(args[0]);
		System.out.println("enter age");
		if(age>=18) {
			System.out.println( "You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible for voting ");

		}
    }
}