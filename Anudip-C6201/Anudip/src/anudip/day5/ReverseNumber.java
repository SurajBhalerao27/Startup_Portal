// Reverse the given number ex--> 5891 will give 1985
package anudip.day5;

public class ReverseNumber {
	public int rev = 0, rem;

	public int rev(int n) {
		for (; n > 0; n /= 10) {
			rem = n % 10;
			rev = rev * 10 + rem;

		}
		System.out.println("Reverse number is :" + rev);

		return 0;
	}

	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		rn.rev(5891);
		// rn.rev(2131);
		// rn.rev(8974);
	}
}
