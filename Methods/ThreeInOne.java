package _intro.java;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ThreeInOne {

	public static void main(String[] args) {
		System.out
				.println("Choose method \n1.Reverse number \n2.Average sequence of numbers " + "\n3.Linear equation ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter number to reverse");
			int number = input.nextInt();
			while (number <= 0) {
				System.out.println("Please enter positive number:");
				number = input.nextInt();
			}

			System.out.println(MessageFormat.format("Reversed number is:{0}", reverseNumber(number)));
			break;
		case 2:
			System.out.println("Enter sequence of numbers:");
			Scanner read = new Scanner(System.in);
			String data = read.nextLine();

			while (data.length() == 0) {
				System.out.println("Sequence must not be empty");
				System.out.println("Enter sequence of numbers:");
				data = read.nextLine();
			}

			String tmpDataArray[] = data.split(" ");
			int dataArray[] = new int[tmpDataArray.length];
			for (int i = 0; i < dataArray.length; ++i) {
				dataArray[i] = Integer.parseInt(tmpDataArray[i]);
			}

			System.out.println(averageInSequnce(dataArray));
			break;
		case 3:
			System.out.println("Enter coefficient a:");
			int a = input.nextInt();
			while (a == 0) {
				System.out.println("Coefficient a must not be 0\nEnter another coefficient:");
			}

			System.out.println("Enter coefficient b:");
			int b = input.nextInt();
			System.out.println(linearEquation(a, b));
		}

	}

	static int reverseNumber(int number) {
		String reverse = new StringBuilder(String.valueOf(number)).reverse().toString();
		int result = Integer.parseInt(reverse);
		return result;
	}

	static double averageInSequnce(int[] numbers) {
		double sum = IntStream.of(numbers).sum();
		double result = sum / numbers.length;
		return result;
	}

	static double linearEquation(int a, int b) {
		double result = (double) -b / a;
		return result;
	}
}
