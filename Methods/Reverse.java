package _intro.java;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		System.out.println(reverseNumber(number));

	}

	static String reverseNumber(String a) {
		String result = new StringBuilder(a).reverse().toString();
		return result;
	}
}
