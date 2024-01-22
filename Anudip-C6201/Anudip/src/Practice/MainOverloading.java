package Practice;

public class MainOverloading {
	 public static void main(int args)
	    {
	        System.out.println("main() overloaded"
	                           + "Executing with int variable");
	    }
	    public static void main(char args)
	    {
	        System.out.println("main() overloaded"
	                           + "Executing with char variable");
	    }
	    public static void main(Double[] args)
	    {
	        System.out.println("main() overloaded"
	                           + "Executing with double variable");
	    }
	public static void main(String[] args) {
		  System.out.println("Original main()"
                  + " Executing");

	}

}
