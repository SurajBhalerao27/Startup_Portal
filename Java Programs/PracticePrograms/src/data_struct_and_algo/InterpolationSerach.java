package data_struct_and_algo;

public class InterpolationSerach {
	public static void main(String[] args) {
//		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int arr[] = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
//		int arr2[] = { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 }; // if there is the array in the reverse order then it will not find the element that we wanted to find.
		int result = interpolationSearch(arr, 8);
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found");
		}
	}

	private static int interpolationSearch(int[] arr, int target) {
		/*
		 *  high and low are the index of the array and the arr[high] and arr[low] is the array values..
		 * */
		int high = arr.length - 1;
		int low = 0;
		while (target >= arr[low] && target <= arr[high] && low <= high) {
			int probe = low + (high - low) * (target - arr[low]) / (arr[high] - arr[low]);
			System.out.println("Probe: " + probe);
			if (arr[probe] == target) {
				return probe;
			} else if (arr[probe] < target) {
				low = probe + 1;
			} else {
				high = probe - 1;
			}
		}
		return -1;
	}
}
