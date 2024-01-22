package com.profound.data_encapsulation;

class Encapsulation {
	public int a = 10;

	void show() {
		System.out.println(a);
	}

	/* this is called nested class */
	class Encapsulation2 {
		void display() {
			System.out.println(a);
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		Encapsulation ob = new Encapsulation();
		Encapsulation.Encapsulation2 ob2 = ob.new Encapsulation2();
		ob.show();
		ob2.display();
	}

}
