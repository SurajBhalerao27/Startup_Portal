package arrays;

public class ArrayExample6 {

	public static void main(String[] args) {
		/*
		 * Enhance for loop is knows as for each loop. This type of loop is used to
		 * fetch data from Array and collection
		 * 
		 * syntax: for(ArrayDatatype variable name:arrayName){}
		 */
		double[] marks = { 90.45, 67.89, 89.00, 45 };
		System.out.println("Using normal for loop:");
	
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println("\nUsing enhanced for loop");
		
		for (double m : marks) {
			System.out.println(m);
		}
	}
}
