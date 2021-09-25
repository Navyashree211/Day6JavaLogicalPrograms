package com.bridgelabz.javaprogram;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {
	public static void main(String[] args) {

		System.out.println("Enter a number to check given number is prime number or not : ");

		int num = InputUtility.getIntValue();
		Utility.PrimeNumber(num);
	}
}
