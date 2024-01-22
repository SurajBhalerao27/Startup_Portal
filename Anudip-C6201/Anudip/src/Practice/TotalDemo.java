package Practice;
import java.util.Scanner;
public class TotalDemo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);  
	        System.out.println("Enter the number: "); 
	        
	int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;++i) {
			
			sum=i+sum;
			
		}
		System.out.println("total:"+sum);
	}

}
