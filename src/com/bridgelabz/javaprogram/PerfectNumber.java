package com.bridgelabz.javaprogram;

import com.bridgelabz.utility.Utility;

public class PerfectNumber {
	public static void main(String[] args) {
	System.out.println("Enter the number to check given number is perfect or not : ");
		int num = InputUtility.getIntValue();
		Utility.getPerfectNumber(num);
	}

}
