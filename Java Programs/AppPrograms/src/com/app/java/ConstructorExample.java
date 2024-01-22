package com.app.java;

public class ConstructorExample {
	int a, b, c;

	public ConstructorExample(int a, int b) {
		this.a = a;
		this.b = b;
		c = 10;

		int res = a + b + c;
		System.out.println(res);
	}

	public static void main(String[] args) {
		ConstructorExample t = new ConstructorExample(50, 40);
	}
}
