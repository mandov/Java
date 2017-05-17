package _intro.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
		System.out.println(factorial(number));

	}

	static BigInteger factorial(long a) {
		BigInteger result = BigInteger.valueOf(0);
		BigInteger multi = BigInteger.valueOf(1);
		long counter = 1;

		while (counter <= a) {
			result = multi.multiply(BigInteger.valueOf(counter));
			multi = result;
			counter++;
		}

		return result;
	}
}
