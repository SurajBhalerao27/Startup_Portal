package com.anudip.hiber;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(3, calculator.add(1, 2)); // these are the test cases
//		assertEquals(2, calculator.add(-1, 2));
		assertEquals(5, calculator.add(0, 5));
//		assertEquals(3, calculator.add(5, 2));
	}

	public void test1() {
		assertEquals(3, calculator.add(5, 2));
	}
	@After
	public void tearDown() throws Exception {
	}

}
