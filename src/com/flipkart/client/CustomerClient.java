/**
 * 
 */
package com.flipkart.client;

/**
 * 
 */
import com.flipkart.business.*;

public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerBusiness customer= new CustomerBusiness();
		System.out.println(customer.createCustomer());
		System.out.println(customer.updateCustomer(1));
		System.out.println(customer.deleteCustomer(1));

	}

}
