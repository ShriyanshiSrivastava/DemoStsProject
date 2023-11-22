package com.flipkart.client;

import com.flipkart.business.*;

public class SciCalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SciCalBusiness cal=new SciCalBusiness();
		System.out.println("Sin-->" + cal.sin(100));
		System.out.println("Cos-->" + cal.cos(100));
		System.out.println("Tan-->" + cal.tan(100));
		System.out.println("Log-->" + cal.log(100));
		System.out.println("Exponential-->" + cal.exponential(2, 3));

	}

}
