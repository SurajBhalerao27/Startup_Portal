package inheritance;
class A1 {
    protected void method()
    {
        System.out.println("Hello Mohini");
    }
}
 
class B1 extends A1 {
    public void method()
    {
        System.out.println("Hello chaitali");
    }
}

public class VisibilityDemo {

	public static void main(String[] args) {
		B1 b=new B1();
		b.method();

	}
}


