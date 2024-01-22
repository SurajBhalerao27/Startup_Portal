package anudip.day5;

public class FactByRecurssion {
	public int rec(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * rec(n - 1);
		}
	}

	public static void main(String[] args) {
		FactByRecurssion a = new FactByRecurssion();
		int result = a.rec(5);
		System.out.println(result);
	}

}
