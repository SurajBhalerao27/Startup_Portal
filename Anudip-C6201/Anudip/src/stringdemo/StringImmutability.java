package stringdemo;
/*
 * String immutability is the ability of String to change the original object
 * Once a String object is Created in scp memory then we will not be able 
 * to change  
 * If we try to concat or make any other then a new String object is Create.
 * 
 * we can refer this new String object by a new variable or use the same 
 * old reference and point to new object.
 * 
 */
public class StringImmutability {

	public static void main(String[] args) {
		String name1="Akash";
		String name2="Akash";
		System.out.println("Are name1 and name2 referring to same object:"+(name1==name2));
		System.out.println("before:\nname1:"+name1+"\nname2:"+name2);
         
		name1=name1.toUpperCase();//same name1  variable will now refer to new object
         
         
         System.out.println("Are name1 and name2 referring to same object:"+(name1==name2));
 		System.out.println("After:\nname1:"+name1+"\nname2:"+name2);
	}

}
