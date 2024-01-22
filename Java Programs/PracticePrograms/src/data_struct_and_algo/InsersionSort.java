package data_struct_and_algo;

public class InsersionSort {
	public static void main(String[] args) {
		int arr[] = { 8, -2, 7, 5, 6, 3, 9, 1, 4 };
		insersionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void insersionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}
}
