package multithreadingExamples;
/*
 * Mam given this programm
 * 
 * 
 * */
class Warehouse {

	int furnitureStock = 100;

	public synchronized void addFurniture(int add) {
		while (furnitureStock >= 50) {
			try {
				System.out.println("\nManufacturer is waiting.....");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		furnitureStock += add;
		System.out.println("Manufacturer is adding more furniture.." + "\nCurrent no. of furniture= " + furnitureStock);

		notifyAll();
	}

	public synchronized void subFurniture(int sub) {
		while (furnitureStock < 50 || sub > furnitureStock || furnitureStock <= 0) {
			try {
				System.out.println("\nBuyer is waiting.....");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		furnitureStock -= sub;
		System.out.println("Buyer is buying more furniture.." + "\nCurrent no. of furniture= " + furnitureStock);

		notifyAll();
	}
}

class Manufacturer extends Thread {
	Warehouse w;
	int add;

	public Manufacturer(Warehouse w, int add) {
		super();
		this.w = w;
		this.add = add;
	}

	@Override
	public void run() {
		while (true) {
			w.addFurniture(add);
		}
	}
}

class Buyer extends Thread {
	Warehouse w;
	int sub;

	public Buyer(Warehouse w, int sub) {
		super();
		this.w = w;
		this.sub = sub;
	}

	@Override
	public void run() {
		while (true) {
			w.subFurniture(sub);
		}
	}
}

public class WaitNotifyDemo {
	public static void main(String[] args) {
		Warehouse w = new Warehouse();
		System.out.println("Initial number of furniture: " + w.furnitureStock);

		Manufacturer m = new Manufacturer(w, 60);
		Buyer b = new Buyer(w, 60);

		m.start();
		b.start();
	}
}
