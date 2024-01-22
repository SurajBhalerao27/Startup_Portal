package interfaces;

interface Hotel11{
	public void dining();
	public void buffer();
	/*
	 * we also create nested interface. It is helpful for together related methods.
	 * 
	 */
	
	interface Banquet{
		public void weddingDecortion();
		public void partyDecortion();
		
		
	}
}
abstract class AshokaHotel11 implements Hotel11{

	@Override
	public void dining() {
		System.out.println("This is dinning method");
	}

	public void buffer() {
		System.out.println("This is buffer method .");
		
	}
	
	
	
}
class SunAndSand11 implements Hotel11.Banquet
{////It is very important syntax 

	@Override
	public void weddingDecortion() {
		// TODO Auto-generated method stub
		System.out.println("This is wedding Decortion method");
	}

	@Override
	public void partyDecortion() {
		// TODO Auto-generated method stub
		System.out.println("This is partyDecortion method");
	}
	
	
	
}


public class InterfaceDemoNew {
public static void main(String[] args) {
	SunAndSand11 s=new SunAndSand11();
//	s.weddingDecortion();
//	AshokaHotel11 a=new AshokaHotel11();
	
	
}
}
