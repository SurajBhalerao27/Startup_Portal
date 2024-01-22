package data_struct_and_algo;

//import java.util.Arrays;

public class BinarySearchAlgo {
	public static void main(String[] args) {
		int arr[] = new int[10000000];
		int target = 4525;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
//		int index = Arrays.binarySearch(arr, target);
		int index = binarySearch(arr, target);
		if (index == -1) {
			System.out.println(target + "not found");
		} else {
			System.out.println("Element found at: '" + index + "' th index");
		}
	}

	private static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int middle = low + (high - low) / 2;
			int value = arr[middle];

			if (value < target) {
				low = middle + 1;
			} else if (value > target) {
				high = middle - 1;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
