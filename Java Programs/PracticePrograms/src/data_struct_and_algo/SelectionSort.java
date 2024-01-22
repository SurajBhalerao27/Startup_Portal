package data_struct_and_algo;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 2, 8, 7, 9, 3, 4, 6, 5, 1 };
		selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
