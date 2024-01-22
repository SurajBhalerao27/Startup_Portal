package anudip.day4;

import java.util.Scanner;
/* class is the template to write our code
 * class is the blue print of an object
 * class is a group of member variable, method and object
 * 
 * object is the real life entity of a class. It has proper memory allocated for different variable and method etc..
 * 
 * object is created with << new >> keyword.
 * 
 * constructor is special method used to create object.
 * 
 * A class can have more than one parameter
 */

public class ClassDemo {
	int a = 10;

	public String display(String b) {

		System.out.println("Today is the last day of our working week: " + a);
		System.out.println("Input recievedin display" + b);

		return "";
	}

	public ClassDemo() {
		System.out.println("I am the constructor of the class.");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "Bhalerao";
		ClassDemo cd = new ClassDemo();
		String s = cd.display("\tSuraj " + name);
	}

}
