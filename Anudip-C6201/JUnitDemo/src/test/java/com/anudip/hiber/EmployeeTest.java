package com.anudip.hiber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	Object[] expectedEmp = new Object[3];

	@Before
	public void setUp() throws Exception {
		expectedEmp[0] = new Employee(1, "Rohit", 5000.0F);
		expectedEmp[1] = new Employee(2, "Surya", 6000.0F);
		expectedEmp[2] = new Employee(3, "VIRAT", 10000.0F);
	}

	@Test
	public void test() {
		Object[] testOutput = Employee.getEmployeeLsit().toArray();
		assertArrayEquals(expectedEmp, testOutput);
	}

	@After
	public void tearDown() throws Exception {
	}
}
