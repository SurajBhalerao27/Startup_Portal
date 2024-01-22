package Fundametal;
import java.util.Scanner;
public class ParameterDemo1 {

	public int add(int num1,int num2) {
		
		
		return num1+num2;
		
	}
	
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner (System.in); 
		ParameterDemo1 pd=new ParameterDemo1();
		
	    System.out.println("Enter the first number: "); 
	    int i= sc.nextInt();
	    
	    System.out.println("Enter the Second number: "); 
	    int j= sc.nextInt();
		int total=pd.add(i, j);
		System.out.println("Addtion of number:"+total);
		
	}
	
	
}
  