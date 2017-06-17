package defineBankAccountClass;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, BankAccount> map = new HashMap<>();
		String command = input.nextLine();
		while (!command.equals("END")) {

			String[] commands = command.split(" ");
			String commandType = commands[0];
			switch (commandType) {

			case "Create":
				createAcc(map, commands);
				break;
			case "Deposit":
				deposit(map, commands);
				break;
			case "Withdraw":
				int id = Integer.valueOf((commands[1]));
				double amount = Integer.valueOf(commands[2]);

				if (!map.containsKey(id)) {
					System.out.println("This id does not exist");
					return;
				}

				try {
					map.get(id).withdraw(amount);
				} catch (IllegalArgumentException iae) {
					iae.getMessage();
				}
			}

			command = input.nextLine();

		}
	}

	private static void deposit(HashMap<Integer, BankAccount> map, String[] commands) {
		int id = Integer.valueOf((commands[1]));
		double amount = Integer.valueOf(commands[2]);

		if (!map.containsKey(id)) {
			System.out.println("The id does not exist");
			return;
		}

		try {
			map.get(id).deposit(amount);
		} catch (IllegalArgumentException iae) {
			iae.getMessage();
		}
	}

	private static void createAcc(HashMap<Integer, BankAccount> map, String[] commands) {
		int id = Integer.valueOf((commands[1]));
		if (map.containsKey(id)) {
			System.out.println("This Id exist");
			return;
		} else {
			BankAccount acc = new BankAccount();
			acc.setId(id);
			map.put(Integer.valueOf(id), acc);
		}

	}
}