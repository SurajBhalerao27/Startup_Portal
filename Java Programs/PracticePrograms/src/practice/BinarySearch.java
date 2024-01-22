package practice;

class BinarySearch {
	int binarySearch(int arr[], int item, int beg, int end) {
		if (end >= beg) {
			int midIndex = beg + (end - beg) / 2;
			if (arr[midIndex] == item) {
				return midIndex;
			}
			if (arr[midIndex] < item) {
				return binarySearch(arr, item, beg, midIndex - 1);
			}
			return binarySearch(arr, item, midIndex + 1, end);
		}
		return -1;
	}

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 13, 45, 65, 16, 117, 82, 19, 2, 50 };
		int n = arr.length;
		int item = 2;
		int ans = ob.binarySearch(arr, item, 0, n - 1);
		if (ans == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("answer: " + ans);
		}
	}
}
