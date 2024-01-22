package interfaces;

//2)All variable in interface are automatically public static and final.
interface Demo2{
	
	int i=100;
	String name="Anudip";

}
public class InterfaceDemo2 {
public static void main(String[] args) {
	
	System.out.println("variable i:"+Demo2.i);
	int i=188;
	
/*
 * 
 * Demo2 d=new Demo2();
 *  AS seen below we will never be to create the object and interface. 	
 */
	
}
}
