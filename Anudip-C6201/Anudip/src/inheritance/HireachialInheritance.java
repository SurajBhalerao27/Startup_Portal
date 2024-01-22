package inheritance;
/*
 *hierarchical inheritance= is multiple child.
 *one parent has multiple child.
 * 
 * 
 * 
 */
class Honda{
	String logo="honda";
	
	
}
class Activa extends Honda {
	
	public void kickstart() {
		
		System.out.println("Bike starting after kick start.");
		
	}
	
	
}
class city extends Honda{
	
public void reverse() {
		
		System.out.println("Car is reversing");
		
	}
	
	
	
	
}
public class HireachialInheritance {

	public static void main(String[] args) {
		city c=new city();
		System.out.println("Logo of city:"+c.logo);
		
		System.out.println();
		
		Activa a =new Activa();
		a.kickstart();
		System.out.println("Logo of city:"+a.logo);

	}

}
