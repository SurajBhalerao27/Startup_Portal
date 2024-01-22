package oopsConcepts.abstraction.interfaces;

interface Hotel {
	public void dining();

	public void buffet();

	/*
	 * Below we are seeing the nested interface. Meaning an interface which is
	 * inside another interface.
	 * 
	 * 
	 * Que - Why we need the nested interfaces. Ans - Because we dont need to
	 * show/give all method to classes. or we just put some special methods for some
	 * specific kind of purposes
	 * 
	 * 
	 * We do thid to group methods together. Any class who wants these methods will
	 * have to implements the Banquet interface separately.
	 */
	interface Banquet {
		public void weddingDecoration();

		public void partyDecoration();
	}
}

/*
 * Below given class we are implementing only outer interface hence have to give
 * methods body to only those methods that are there in outer interface Hotel
 * 
 */
class SurajHotel implements Hotel {

	@Override
	public void dining() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buffet() {
		// TODO Auto-generated method stub

	}
}
/*
 * Here we are implents the nested interfaces by the " . " operator and we can
 * access all methods that are presented inside the interfaces are used
 */

/*
 * Below we are SunAndSand we are implementing both the outer and inner
 * interfaces hence this class has to give method body to all the methods of
 * both the interfaces.
 */
class SunAndSand implements Hotel, Hotel.Banquet {

	@Override
	public void weddingDecoration() {
		// TODO Auto-generated method stub

	}

	@Override
	public void partyDecoration() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dining() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buffet() {
		// TODO Auto-generated method stub

	}
}

public class InterfaceDemo5 {
	public static void main(String[] args) {

	}
}