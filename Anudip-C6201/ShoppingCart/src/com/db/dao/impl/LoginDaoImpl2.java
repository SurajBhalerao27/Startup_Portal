package com.db.dao.impl;

import java.util.List;

import com.db.dao.LoginDao2;
import com.db.pojo.Customer;

public class LoginDaoImpl2 implements LoginDao2{
	
	
	List<Customer> custlist=null;
	
	public LoginDaoImpl2(List<Customer> custlist) {
		
		
		this.custlist=custlist;
	}
	
	@Override
	public boolean customerLogin(String email, String password) {
		for(Customer c:custlist) {
			
			if(c!=null && c.getEmail().equals(email) && c.getPassword().equals(password)) {
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean adminLogin(String email, String password) {
		if(email.equals("admin@gmail.com") && password.equals("admin@123")) {
			
			return true;
		}
		return false;
	}

}
