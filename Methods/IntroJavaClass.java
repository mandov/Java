package _intro.java;

import java.text.MessageFormat;
// import = using namespace 
import java.util.Scanner;

public class IntroJavaClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String firstName = input.nextLine();
		String secondName = input.nextLine();

		if (firstName.isEmpty()) {
			firstName = "*****";
		}

		if (secondName.isEmpty()) {
			secondName = "*****";
		}

		System.out.println(MessageFormat.format("Hello {0} {1}", firstName, secondName));
	}
}