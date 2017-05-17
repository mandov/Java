package _intro.java;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(lastDigit(number));

	}

	static String lastDigit(int number) {
		String result = " ";

		switch (number % 10) {
		case 1:
			result = "one";
			break;
		case 2:
			result = "two";
			break;
		case 3:
			result = "three";
			break;
		case 4:
			result = "four";
			break;
		case 5:
			result = "five";
			break;
		case 6:
			result = "six";
			break;
		case 7:
			result = "seven";
			break;
		case 8:
			result = "eight";
			break;
		case 9:
			result = "nine";
			break;
		}
		return result;
	}
}
