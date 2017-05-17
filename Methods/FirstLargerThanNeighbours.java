package _intro.java;

import java.util.Scanner;

public class FirstLargerThanNeighbours {

	public static void main(String[] args) {
		System.out.println("Size of array");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println(firstLarger(arr));
	}

	static int firstLarger(int[] arr) {
		int result = -1;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
				result = i;
				break;
			}

		}

		return result;
	}
}
