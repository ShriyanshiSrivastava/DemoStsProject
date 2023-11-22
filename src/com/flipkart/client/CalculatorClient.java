package com.flipkart.client;

import com.flipkart.business.*;

public abstract class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusinessCalculator cal=new BusinessCalculator();
		System.out.println("Addition-->" + cal.addition(10, 10));
		System.out.println("Subtraction-->"+ cal.subtraction(20, 10));
		System.out.println("Divide-->" + cal.division(20, 10));
		System.out.println("Multiply"+ cal.multiplication(20, 30));

	}

}
