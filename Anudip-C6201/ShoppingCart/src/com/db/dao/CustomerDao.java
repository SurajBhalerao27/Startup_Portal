package com.db.dao;

import com.db.pojo.Customer;

public interface CustomerDao {

	public boolean addCustomer(Customer c);

	public boolean updateCustomer(Customer c);

	public Customer showCustomerById(Integer custId);

}
