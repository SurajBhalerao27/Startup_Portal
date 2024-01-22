package Practice;

public class ForTask {
public static void main(String[] args) {
	

			int i, j;
			int num = 1;
			// outer loop to handle number of rows
			for (i = 1; i <= 5; i++) {
				// inner loop to print spaces
				for (j = 1; j <= i; j++) {
					System.out.print(" ");
					 if (i == 0 || j == 0 || i == 5 - 1
			                    || j == 5- 1) {
			                    System.out.print("*");
			                }
			                // otherwise print space only.
			                else {
			                    System.out.print(" ");
			                }
				}

				// inner loop to print stars
				for (j = 1; j <= 5; j++) {
					System.out.print("*");
				}
				// printing new line for each row
				System.out.println();
			}
		}

		
	}


	 
	
	


