package stringdemo;
/*
 * equals methods =It is used for to check the content of the object.(It is give the answer as true or false).
 * comapreTo method=It is used for to check the content of the object.(It is give the answer as 0 or 22).
 * 
 * == operators=It is check location of object.
 * 
 */
public class CompareToEquals {
public static void main(String[] args) {
	
	String a1="chaitali";
	String a2="chaitali";
	String a3="Mohini";
	String a4=new String("chaitali");
	System.out.println("for Compare to methods:"+a1.compareTo(a2));
	System.out.println("for the equals methods:"+a1.equals(a2));
	System.out.println("==========");
	System.out.println(a1==a2);
	
	System.out.println("for Compare to methods:"+a1.compareTo(a3));
	System.out.println("for the equals methods:"+a1.equals(a3));
	System.out.println(a1==a4);
}
}
