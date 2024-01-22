package practice;

class MyCoustomException extends Exception {
	public MyCoustomException(String messege) {
		super(messege);
	}
}

public class CostomExceptionEx {
	public static void main(String[] args) {
		try {
			int a = 10;
			if (a < 5) {
				throw new MyCoustomException("This is not valid!");
			}
		} catch (MyCoustomException e) {
			System.out.println(e.getMessage());
		}
	}
}
