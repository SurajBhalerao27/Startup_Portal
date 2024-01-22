// WAP to find sum of 10 whole numbers using while loop
package anudip.day7;

public class WhilePractice1 {

	public static void main(String[] args) {
		int n = 10, s = 0;
		while (n >= 1) {
			s += n;
			n--;
		}
		System.out.println("The sum is : " + s);
	}
}
