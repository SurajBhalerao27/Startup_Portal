package stringdemo;

import java.util.Scanner;

public class ToCharArrayTask {

	public static void main(String[] args) {
		System.out.println("Enter a word:");
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
	    char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++) {
        	
        	int j;
        	
        	for(j=i+1;j<c.length;j++) {
        		
        		if(c[i]==c[j]) {
        			
        			c[i]=' ';
        		}
        	}
        	
        }
        	s=new String(c);
        	s=s.replace(" ","");
        	System.out.println(s);
        	
        	
        
	}

}
