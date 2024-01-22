package oopsConcepts.abstraction.interfaces;

interface Camera {
	public void clickPics();
}

interface PhoneCalls {

	public void calling();
}

class CandyCrushGame {
	public void increasePoints() {

		System.out.println("Points increasing on three  match...");
	}

	public void bgMusic() {
		System.out.println("Bg music is playing...");
	}

	public void graphics() {
		System.out.println("Graphics of the game is changing acc to stages of game...");
	}
}
/*We should always extends first and implemnts later.
 * */
class Mobile extends CandyCrushGame implements PhoneCalls, Camera {
	@Override
	public void calling() {
		System.out.println("Calling contact through lanline");
	}

	@Override
	public void clickPics() {
		System.out.println("Clicking pics by mobile...");
	}

}

public class InterfaceDemo3 {
	public static void main(String[] args) {
		Mobile m = new Mobile();
	}
}
