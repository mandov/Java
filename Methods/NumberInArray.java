package _intro.java;

import java.util.Scanner;

public class NumberInArray {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter sequence of numbers:");

		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Enter number:");
		int number = input.nextInt();

		System.out.println(mostCommonNum(arr, number));
	}

	static int mostCommonNum(int[] arr, int number) {
		int result = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == number) {
				result++;
			}
		}

		return result;
	}
}
