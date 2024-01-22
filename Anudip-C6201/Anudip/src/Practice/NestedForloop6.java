package Practice;

public class NestedForloop6 {
/*
 * 1)if the pattern is a solid square or rectangle then the number of times that outer loop and inner loop will run is fixed.
 * 2)if the pattern widen or taper from top to bottom  then we to see the relation between i and j.
 * 
 * 
 */
	public static void main(String []args ) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				
				if(j%2==0) {
					System.out.print("0");
					
					
				}
				else{
					System.out.print("1");
				}	
				for(;i%2==0;) {
					if(j%2==0) {
						System.out.print("1");
						
						
					}
					else{
						System.out.print("0");
					}	
			}
			System.out.println();
			
			
		
   }	
}		
}
	
}	

