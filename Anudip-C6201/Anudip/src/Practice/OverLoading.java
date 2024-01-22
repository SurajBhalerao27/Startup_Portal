package Practice;


class Student6{
	String name="Chaitali";
	int rollNo=9;
	public void attendSession(){
		System.out.println("The student is attending the sessions");
		
		
		
	}
	
	
}
class Chaitali extends Student6{
	public void attendSession(){
		System.out.println("The student is attending the sessions online\n"+super.name);
		
		
		
	}
	
	
	
}
public class OverLoading {
	public static void main(String[] args) {
		Chaitali c=new Chaitali();
		c.attendSession();

	}

}
