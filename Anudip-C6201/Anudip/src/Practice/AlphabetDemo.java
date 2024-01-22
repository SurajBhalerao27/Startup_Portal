package Practice;

import java.util.Scanner;
class Test4{
	
	public void check(char c) {
		
		if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e') {
			
			System.out.println("Alphabet is vowel.");
			
		}
		else
		{
			
			System.out.println("Alphabet is consonant.");
			
		}
	}
	
}
public class AlphabetDemo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Alphabet:");
		    char a =sc. next().charAt(0);
		    Test4 t4=new Test4();
		    t4.check(a);
		    
	}

}
