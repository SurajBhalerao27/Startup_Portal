package stringdemo;
/*if we want to create mutable object of character sequence then we should use StringBuffer or StringBuilder. 
 *
 * these are also classes that create mutable object.
 * 
 * concatination =It is process of adding word or character to an exiting String.
 * In StringBuffer,we can change old object therefore StringBuffer is mutable class in java
 * 
 * StringBuffer and StringBuilder classes are both used to create mutable String object
 * The only difference between the the two class is StringBuffer is thread safe and String Builder is NOT thread safe
 * 
 */


public class StringBufferDemo1 {
public static void main(String[] args) {
	
	StringBuffer sb=new StringBuffer("Anudip");
	String s="Anudip";
	
	System.out.println("\nBefore new object");
	System.out.println("s="+s+"\nsb="+sb);
	
	s.concat("foundation");
	sb.append("foundation");
	
	System.out.println("\nAfter new object");
	System.out.println("s="+s+"\nsb="+sb);
}
}
