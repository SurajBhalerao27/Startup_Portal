/*
   Generate the Fib… series  1   1   2   3   5   8    13
*/

package practice;
public class FibbonacciSeries {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of terms in the Fibonacci series: ");
//        int n = input.nextInt();

        int a = 1, b = 1, c;
//        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= 7; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
