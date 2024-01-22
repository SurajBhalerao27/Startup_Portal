package Practice;

import java.util.Scanner;

public class SwitchIceCream {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);  
	      System.out.println("Enter the colour: "); 
	      String flavour =sc.nextLine();
	      switch(flavour) {
	      case "chocolate":  
	      System.out.println("The cost of ice-cream is 200.");
	      break;
	      case "pistachio":  
	          System.out.println("The cost of ice-cream is 300.");
	      break;
	      case "salted caramel":  
	          System.out.println("The cost of ice-cream is 150");
	      break;
	      case "butterscotch":  
	          System.out.println("The cost of ice-cream is 120");
	      break;
	      case "black Raspberry chip":  
	          System.out.println("The cost of ice-cream is 600");
	      break;
	      default:
	        	  System.out.println("Invaild flavour.");
	      }

	}

}
