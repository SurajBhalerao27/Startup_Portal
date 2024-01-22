package Practice;

import java.util.Scanner;

public class NameTest
{
public static String ask()
{
	Scanner sc = new Scanner (System.in);  
    System.out.println("Enter the Name: "); 
    String str= sc.next();
    System.out.println("You have entered: "+str); 
    return str;
	
	
}
public static void main(String [] args) {
	NameTest nt=new NameTest();
	String str1=nt.ask();
	System.out.println("Hello " +str1+".WELCOME TO THIS JAVA SESSION.");
	
	
	
}
}
