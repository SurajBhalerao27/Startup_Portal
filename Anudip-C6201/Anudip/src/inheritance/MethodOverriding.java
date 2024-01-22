package inheritance;

class Parent{
	
	public void sendResume() {
		System.out.println("sending resume by post...");
		
		
		
	}
	
	
	
}
class Child6 extends Parent{
	
	public void sendResume(String s) 
	{
		System.out.println("sending resume by email..."+s);
	
		
	}
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child6 c=new Child6();
		c.sendResume("chaitali");
		c.sendResume();
	}

}
