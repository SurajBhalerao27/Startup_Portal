/*Write a java program to initialize array having size seven and print count of even numbers.
  also find even numbers */

package practice;

public class CountOfEvenOdd {

	public static void main(String[] args) {
		int a[] = { 2, 5, 50, 33, 111, 90, 45, 80, 90, 121, 60, 40};
		int c = 0, sum = 0;

		for (int element : a) {
			if (element % 2 == 0) {
				System.out.println(element);
				sum = sum + element;
				c++;
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("The Count of Even numbers is = " + c);
		System.out.println("The Sum of Even numbers is = " + sum);
	}
}
