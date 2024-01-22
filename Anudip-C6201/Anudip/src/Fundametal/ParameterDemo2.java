package Fundametal;

import java.util.Scanner;

public class ParameterDemo2 {

  public static String taking(String name, String email) {
    
	  return "\n The name"+name+"\nEmail:"+email;

  }
  public static void main(String[] args) {
    ParameterDemo2 pd2 = new ParameterDemo2();
    
    
    
   Scanner sc = new Scanner(System.in);
    
   
   System.out.println("Enter the Name: ");
    String name = sc.next();
    
    
  
    System.out.println("Enter the email: ");
    String email = sc.next();

     String message=pd2.taking(name, email);
     System.out.println("message:"+message);

  }
}