package billGenerator;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.id = 1;
		p1.name = " My Product 1";
		p1.price = 1000;

		Product p2 = new Product();
		p2.id = 2;
		p2.name = " My Product 1";
		p2.price = 500;

		Product p3 = new Product();
		p3.id = 3;
		p3.name = " My Product 1";
		p3.price = 1000;

		Bill b = new Bill();
		double res = b.generateBill(p1, p2, p3);
		System.out.println("Total Bill After 10 % Discount :" + res);
	}
}
