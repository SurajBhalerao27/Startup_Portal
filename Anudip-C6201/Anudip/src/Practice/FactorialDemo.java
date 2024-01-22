package Practice;
import java.util.Scanner;
public class FactorialDemo {

    public double factorial1(double num) {
    double i;
    double fact = 1;
    for (i = 2; i <= num; i++) {

      fact = fact * i;

      
    }
    return fact;

  }
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter your Number:");
     double num = sc.nextDouble();
      FactorialDemo fd = new FactorialDemo();
      double Result = fd.factorial1(num);
     System.out.println("factorial of number:"+Result);
  }
}