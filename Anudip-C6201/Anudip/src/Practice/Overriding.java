package Practice;

//overridding=different class,reusbility,with same parameters data type.
class Student{
	String name="Chaitali";
	int rollNo=9;
	public void attendSession(){
		System.out.println("The student is attending the sessions");
		
		
		
	}
	
	
}
class Chaitali4 extends Student{
	
	

	public void attendSession(){
		System.out.println("The student is attending the sessions online\n"+super.name);
		
		
		
	}
	
	
	
}
public class Overriding {
	public static void main(String[] args) {
		Chaitali4 c=new Chaitali4();
		c.attendSession();

	}

}
