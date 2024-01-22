package practice;

import java.util.Scanner;

interface CalculateCube {
	int cube(int b);
}

interface CalculateSqareRoot {
	double sqareRoot(double a);
}

class Rectangle implements CalculateCube, CalculateSqareRoot {
	int square(int a) {
		int result = a * a;
		return result;
	}

	@Override
	public int cube(int b) {
		int result = b * b * b;
		return result;

	}

	@Override
	public double sqareRoot(double num) {
		double temp;
		double sqareRoot = num / 2;
		do {
			temp = sqareRoot;
			sqareRoot = (temp + (num / temp)) / 2; // This is the famous "Newton-Raphson" Method. It calculates
													// The squareroot by the recursive method.
		} while ((temp - sqareRoot != 0));

		return sqareRoot;
	}
				//return Math.sqrt(num);
	  // this is way more simple method to find the sqareroot of the number.
}

public class InterfacePract {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter a number : ");
		int randNum = sc.nextInt();
		int sqareResult = rectangle.square(randNum);
		double cubeResult = rectangle.cube(sqareResult);
		double squareRootResult = rectangle.sqareRoot(cubeResult);

		System.out.println("Square of " + randNum + " is: " + sqareResult);
		System.out.println("Cube of " + sqareResult + " is: " + cubeResult);
		System.out.println("Square root of " + cubeResult + " is: " + squareRootResult);

	}
}
