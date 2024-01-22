package inheritance;
class car5{
	
	public void run(String name) {
		System.out.println("This car run on petrol:"+name);
		
	}
    public void run(String fuelnew,String fuel ) {
		System.out.println("This car run on CNG and petrol:"+fuelnew+ " and " +fuel);
		
	}
	
}


public class MethodLoadingP {
  public static void main(String[] args) {
	  car5 c1=new car5();
	  c1.run("tata");
	  c1.run("tata","moto");
}
}
