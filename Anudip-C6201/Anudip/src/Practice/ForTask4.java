package Practice;

public class ForTask4 {
	public static void main(String[] args) {
		
	
	 int i, j;
     // outer loop to handle number of rows
     for (i = 0; i < 5; i++) {
         //  inner loop to handle number of columns
    	 for (j = 1; j <= i; j++) {
             for (j = 0; j < 5; j++) {
             // star will print only when  it is in first
             // row or last row or first column or last
             // column
             if (i == 0 || j == 0 || i == 5 - 1
                 || j == 5- 1) {
                 System.out.print("*");
             }
             // otherwise print space only.
             else {
                 System.out.print(" ");
             }
           }
         }
         System.out.println();
     }
     
 }
}
