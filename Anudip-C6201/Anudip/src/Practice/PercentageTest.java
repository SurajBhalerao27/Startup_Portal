package Practice;
import java.util.Scanner;
public class PercentageTest {
	public double ask() 
	{	
		Scanner sc = new Scanner (System.in);  
        System.out.println("Enter the Mark: "); 
        
        double R=sc.nextDouble();
        double Result=R/500*100;
		return Result;
	
	
}
public static void main(String[] args) {	
	PercentageTest pt=new PercentageTest();
	double Ans=pt.ask();
	System.out.println("percentage of student is:"+Ans);
	
	
	
}
}
