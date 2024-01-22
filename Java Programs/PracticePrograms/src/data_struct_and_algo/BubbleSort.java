package data_struct_and_algo;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 6, 4, 6, 8, 6, 9, 10 };
		System.out.print("Before Sorting: \n");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n\nAfter Sorting:");
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
