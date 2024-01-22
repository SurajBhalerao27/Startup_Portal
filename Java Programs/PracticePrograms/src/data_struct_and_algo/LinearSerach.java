package data_struct_and_algo;

public class LinearSerach {
	public static void main(String[] args) {
		/* it is faster in short or medium data sets and it tool time for larger data sets.
		 *
		 * It takes O(n) - linear time to execute.
		 *
		 * it do not return if duplicate values is present in this.
		 * */
		int[] array = { 9, 2, 3, 4, 6, 4, 68, 2, 3 };
		int index = linearSearch(array, 68);
		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found ");
		}
	}

	private static int linearSearch(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
