package fundamentals;

public class PrameterDemo2 {

	public void display(String a, int b) {

		System.out.println("String input is : " + a);
		System.out.println("Int Input is : " + b);
	}

	public static void main(String[] args) {
		PrameterDemo2 pq = new PrameterDemo2();
		pq.display("Java", 80);
	}
	
}
