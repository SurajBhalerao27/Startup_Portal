package stringdemo;
/*
 * This methods is return the a new string in which there are all character of the original string starting 
 * from the the given index.
 *  
 * 
 * 
 */


public class SubStringDemo {

	public static void main(String[] args) {
		String address="Andheri west,Azad nagar";
		
		String s1=address.substring(8);
		
		String s2=address.substring(8,12);
		System.out.println("Address: "+address);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
	}

}
