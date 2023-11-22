/**
 * 
 */
package com.flipkart.business;

/**
 * 
 */
public class CustomerBusiness {
	public String createCustomer() {
		return "Customer is created";
	}
	
	public boolean updateCustomer(int id) {
		System.out.println("Customer is updated by id"+ id);
		return true;
	}
	
	public boolean deleteCustomer(int id) {
		System.out.println("Customer is deleted by id"+ id);
		return true;
	}
	
}
