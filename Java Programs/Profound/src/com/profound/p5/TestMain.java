package com.profound.p5;

import com.profound.p3.p4.Employee;
import com.profound.p3.p4.Factorial;

public class TestMain implements Factorial {

	int n;

	@Override
	public void set(int n) {
		this.n = n;
	}

	@Override
	public void find() {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("Factorial Is = " + f);
	}

	public static void main(String[] args) {
		TestMain ob = new TestMain();
		ob.set(8);
		ob.find();

		Employee em = new Employee(101, 15000, "Mr Modern");
		System.out.println(em);

	}
}
