package com.bridgelabz.utility;

public class Utility {
	// Fibonacci Series
	public static void FibonacciSeries() {

		int n1 = 0, n2 = 1, n3, i, count = 10;

		System.out.println("The first number of fiboacci series are 0 and 1. ");
		System.out.println(n1 + " " + n2); // print 0 and 1

		for (i = 2; i < count; i++) { // loop starts from 2 because 0 and 1 are already printed.
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
	// To check given Number is Prime Number Or Not.

	public static void PrimeNumber(int num) {

		int i, m = 0, flage = 0;
		m = num / 2; // it is condition to check nonPrime Number
		if (num == 0 || num == 1) {
			System.out.println(num + "is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number ");
					flage = 1;
					break;

				}
			}
			if (flage == 0) {
				System.out.println(num + " is prime number ");
			}
		}

	}

	// To check given number is Perfect Number or Not

	public static void getPerfectNumber(int num) {
		int sum = 0, i = 1;

		while (i <= num / 2) // execute until the condition becomes false.
		{
			if (num % i == 0) {
				sum = sum + i; // calculates the sum of factors.

			}
			i++; // after each iteration increments the value of variable i by 1.
		}
		if (sum == num) // compares sum with the number.
		{
			System.out.println(num + "is a perfect number. "); // print if sum and num are equal.
		} else {
			System.out.println(num + " is not a perfect number.");
		}
	}
	// To find reverse number.

	public static void getReverseNumber(int num) {
		int reverse = 0;
		while (num != 0) { // repeat below steps until the num becomes 0.
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is :" + reverse);
	}
	// CouponNumber

}
