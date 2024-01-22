package Fundametal;
import java.util.Scanner;
public class Areatriangle {

	public double area(double a,double i,double j) {
		
		double total=0.5*i*j;
		return total;
		
	}
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner (System.in); 
		
	    System.out.println("Enter the height: "); 
	    double i= sc.nextDouble();
	    
	    System.out.println("Enter the base of triangle: "); 
	    double j= sc.nextDouble();
	    
	    Areatriangle at=new Areatriangle();
	    
	    double output=at.area(0.5,i,j);
	    System.out.println("area of triangle:"+output);
		
	}
	
}
