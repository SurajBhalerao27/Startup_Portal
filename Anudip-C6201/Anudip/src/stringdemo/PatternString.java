package stringdemo;

import java.util.Scanner;

public class PatternString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String word=sc.nextLine();
		
		for(int i=0; i<word.length(); i++) {
		for(int j=word.length()-1;j>=i;j--) {
	          
			System.out.print(word.charAt(j));
					
				}
		      System.out.println();
		}
		    
		}
		

	}

