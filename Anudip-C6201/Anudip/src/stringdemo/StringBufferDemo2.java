package stringdemo;

public class StringBufferDemo2 {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Anudip");
	String s="Anudip";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		
	}
	sb.reverse();
	System.out.println("Reverse using String:"+rev);
	System.out.println("Reverse using StringBuffer:"+sb);
	/*
	 * In String,we can replace all word.
	 * but in Stringbuffer/StringBuilder class the replace is used to replace  the character from start 
	 * to end index are replaced by new String 
	 * 
	 */
	
	
	StringBuffer sb2=new StringBuffer("Indian Cricket Team");
	
	System.out.println("Before:"+sb2);

	sb2.replace(7, 14, "Hockey");
	
	System.out.println("After:"+sb2);
	
}
}
