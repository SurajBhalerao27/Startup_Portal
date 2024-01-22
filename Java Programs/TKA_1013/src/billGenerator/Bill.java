package billGenerator;

public class Bill {
	double generateBill(Product p1, Product p2, Product p3) {

		double totalbill = (p1.price + p2.price + p3.price);
		double disc = totalbill * 0.10;
		System.out.println("Totol Bill: " + totalbill + "\nDisc Rs: " + disc);
		return totalbill = totalbill - disc;
	}

}
