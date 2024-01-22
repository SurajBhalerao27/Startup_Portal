package demo1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		decimalFormat.setGroupingUsed(true);
		decimalFormat.setGroupingSize(3);
		A aa = new A();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter km you wanted to convert");
		int km = scanner.nextInt();
		long result = aa.kmToMeter(km);
		System.out.println("Km to meters is: " + decimalFormat.format(result) + " Meters");
		scanner.close();
	}

}
