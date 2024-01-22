package inheritance;


class ProtectedDemo {
    protected void method()
    {
        System.out.println("Hello Mohini");
    }
}
 
public class publicDemo extends ProtectedDemo {
    public void method()
    {
        System.out.println("Hello chaitali");
    }


public class VisibilityIncreasingDemo {

	public static void main(String[] args) {
		publicDemo pd=new publicDemo();
		pd.method();
	}

}
}