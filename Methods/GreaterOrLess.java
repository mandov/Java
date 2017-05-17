package _intro.java;

import java.util.Scanner;

public class GreaterOrLess {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println(GreaterOrLessThan(arr));
	}

	static int GreaterOrLessThan(int[] arr) {
		int result = 0;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
				result++;
			}

		}

		return result;
	}
}
