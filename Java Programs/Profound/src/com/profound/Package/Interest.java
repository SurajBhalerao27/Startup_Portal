package com.profound.Package;

public class Interest {
	double pinciple, no_of_yr, rate_of_interest, simple_interest;

	public Interest(double pinciple, double no_of_yr, double rate_of_interest) {
		super();
		this.pinciple = pinciple;
		this.no_of_yr = no_of_yr;
		this.rate_of_interest = rate_of_interest;

	}

	public void show() {
		simple_interest = (pinciple * no_of_yr * rate_of_interest) / 100;
		System.out.println("The Simple interest is : " + simple_interest + " Rs.");
	}
}
