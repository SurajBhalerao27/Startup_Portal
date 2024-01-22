package stringdemo;
import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		
		
		String s="Hi my name is  _.I am from _.I have done graduation in _.";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
		System.out.println("Enter the your Location:");
		String Location=sc.nextLine();
		
		System.out.println("Enter the your Education:");
		String Education=sc.nextLine();
		
	
		 String s1=s.replaceFirst("_",name);
		System.out.println("NewString:"+s1);
		String s2=s1.replaceFirst("_",Location);
		System.out.println("NewString:"+s2);
		
		
		String s3=s2.replaceFirst("_",Education);
		System.out.println("NewString:"+s3);
	}

}
