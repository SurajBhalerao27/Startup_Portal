package Practice;
import java.util.Scanner;
	public class CircleTest1 {

	public double Area() {
			  Scanner sc = new Scanner (System.in);  
		        System.out.println("Enter the radius: "); 
		        
		double R=sc.nextDouble();
		double PI=3.14;
		double Result=R*R*PI;
		
		return Result;
		
		
		
	}
	public static void main(String [] args) {
		CircleTest1 ct=new CircleTest1();
		double Ans=ct.Area();
		System.out.println("Area of circle:"+Ans);
		
		
	}
	}

