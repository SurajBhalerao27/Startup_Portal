// Calculate the number of digits present in a given number ex --> 65791 have 5 digits
package anudip.day5;

public class NumberOFDigit {

	public int digitCounter(int n) {
		int count = 0;
		for (int i = 0; n > 0; i++) {
			n /= 10;
			count++;
		}
		System.out.println("Digit Count is: " + count);
		return 0;
	}

	public static void main(String[] args) {
		NumberOFDigit nd = new NumberOFDigit();
		nd.digitCounter(65791);
		nd.digitCounter(52);
		nd.digitCounter(78956625);
//		System.out.println(result);
	}

}
