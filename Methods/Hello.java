package _intro.java;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Enter name:");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println(sayHello(name));
	}

	static String sayHello(String str) {
		String result = "Hello," + str + "!";
		return result;
	}
}
