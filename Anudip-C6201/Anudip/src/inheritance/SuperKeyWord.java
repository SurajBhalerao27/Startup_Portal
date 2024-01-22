package inheritance;
/*
 * super= It is represent the parent class object.
 * It will always declare the immediate parent.
 * 
 * 
 * 
 */
class University{
	
	String name ="university of mumbai";
	
	
}
class College extends University{
	
	String name="Bhavan college";
	public void display() {
		
		System.out.println("Name:"+name);
		System.out.println("Name of university:"+super.name);
	}
	
}
class Department extends College{
	
	String name="chemistry department";
public void show() {
		
		System.out.println("Name:"+name);
		System.out.println("Name of university:"+super.name);
}
}
public class SuperKeyWord {

	public static void main(String[] args) {
		College c=new College();
        c.display();
        Department d=new Department();
        d.show();
	}

}
