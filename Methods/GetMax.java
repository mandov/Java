package _intro.java;

import java.util.Scanner;

public class GetMax {

	public static void main(String[] args) {
		System.out.println("Enter numbers:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int greater = getMax(a, b) > c ? getMax(a, b) : c;
		System.out.println(greater);
	}

	static int getMax(int a, int b) {
		int greater = a > b ? a : b;
		return greater;
	}
}
