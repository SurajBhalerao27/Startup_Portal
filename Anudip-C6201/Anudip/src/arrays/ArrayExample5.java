package arrays;

//find the double of array variable.
public class ArrayExample5 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i] * 2;
			System.out.println("Double of " + a[i] + " = " + b[i]);
		}
	}
}
