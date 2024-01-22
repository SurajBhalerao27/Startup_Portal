package com.profound.inheritance2;

public class MultipleInheritance2 implements B {
	int a, b;

	@Override
	public void seta(int a) {
		this.a = a;

	}

	@Override
	public void setb(int b) {
		// TODO Auto-generated method stub
		this.b = b;
	}

	void add() {
		System.out.println("Addition is : " + (a + b));
	}

	public static void main(String[] args) {
		MultipleInheritance2 ob = new MultipleInheritance2();
		ob.seta(40);
		ob.setb(50);
		ob.add();
	}

}
