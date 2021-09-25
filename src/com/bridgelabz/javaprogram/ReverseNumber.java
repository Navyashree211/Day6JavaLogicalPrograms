package com.bridgelabz.javaprogram;

import com.bridgelabz.utility.Utility;

public class ReverseNumber {   
	public static void main(String[] args) {
		System.out.println("Enter the number to find reverse number : ");
		
		int num = InputUtility.getIntValue();
		Utility.getReverseNumber(num);
	}

}
