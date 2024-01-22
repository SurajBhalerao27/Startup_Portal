package calculator;
import java.util.Scanner;

public class CalculatorP {
	Scanner scan = new Scanner(System.in);
	int num1, num2;

	public void addition() {
		System.out.println("Enter two numbers to add:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Addition of "+num1+" and "+num2+" is: "+(num1+num2));
	}
	public void subtraction() {
		System.out.println("Enter two numbers to subtract:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Subtraction of "+num1+" and "+num2+" is: "+(num1-num2));
	}
	public void multiplication() {
		System.out.println("Enter two numbers to multiply:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Multiplication of "+num1+" and "+num2+" is: "+(num1*num2));
	}
	public void division() {
		System.out.println("Enter two numbers to divide:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Division of "+num1+" and "+num2+" is: "+(num1/num2));
	}
	public void findRemainder() {
		System.out.println("Enter two numbers to find remainder:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Remainder when "+num1+" is divided by "+num2+" is: "+(num1%num2));
	}
	public void findSquare() {
		System.out.println("Enter a number to find its square:");
		num1 = scan.nextInt();
		System.out.println("Square of " +num1+" is: "+num1*num1);
	}
}
