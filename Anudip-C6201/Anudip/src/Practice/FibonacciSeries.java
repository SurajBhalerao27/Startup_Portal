package Practice;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.print(num1+"  "+num2);
		 int count=1;
		
		while(count<=8) {
			int num3=num1+num2;
			System.out.println("  "+num3);
			num1=num2;
			num2=num3;
			count++;
			
			
			
		}
		
		
		
	}
}
