package stringdemo;
/*String is Predefined class.
 * String object are used 
 * 
 * ctrl+mouse left click. 
 *  
 */
public class StringDemo {
public static void main(String[] args) {
	String s="Chaitali";
	String class1="Anudip";
	String class2="Anudip";
	/*aa
	 * making the new object using new keyword
	 * we are create a empty constructor to create the object.
	 * 
	 * 
	 */
	System.out.println("class2:"+class2);
   String s1=new String();
	System.out.println("s=  "+s1);
	
	//again we are calling to parameterized constructor which accept String type data.
	String s2=new String("Mohini");
	System.out.println("s2= "+s2);
	
	String s3=new String(s);
	System.out.println(s3);
	
	String s4=new String(class1);
	System.out.println(s4);
	
	/*
	 *below we are making object of the String class to accept the char Array 
	 *when we print s4 object of String class the we can see all character which store in the character Array  
	 * 
	 * 
	 * 
	 */
	char symbols[]= {'*','#','$','%'};
	String s5=new String(symbols);
	
}
}
