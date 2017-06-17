package DefiningClasses;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, BankAccount> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();

        while (!command.equals("END")) {
            String[] commands = command.split(" ");
            String commandType = commands[0];
            switch (commandType) {
                case "Create":
                    addAcc(map, commands[1]);
                    break;
                case "Deposit":
                    deposit(map, commands);
                    break;
                case "Withdraw":
                    withdraw(map, commands);
                    break;
                case "Print":
                    print(map, commands[1]);
            }

            command = input.nextLine();
        }
    }

    private static void print(HashMap<Integer, BankAccount> map, String command) {
        int id = Integer.valueOf(command);
        System.out.print(map.get(id));
    }

    private static void withdraw(HashMap<Integer, BankAccount> map, String[] commands) {
        int id = Integer.valueOf(commands[1]);
        double amount = Double.valueOf(commands[2]);
        if (!map.containsKey(id)){
            System.out.print("This acc does not excist");
        }
        else{
            map.get(id).withdraw(amount);
        }
    }

    private static void deposit(HashMap<Integer, BankAccount> map, String[] commands) {
        int id = Integer.valueOf(commands[1]);
        double amount = Double.valueOf(commands[2]);
        if (!map.containsKey(id)) {
            System.out.print("This acc does not excist!");
        } else {
            map.get(id).deposit(amount);
        }
    }

    private static void addAcc(HashMap<Integer, BankAccount> map, String command) {

        int id = Integer.valueOf(command);
        if (map.containsKey(id)) {
            System.out.print("This acc excist");
        } else {
            BankAccount acc = new BankAccount();
            map.put(id, acc);
        }
        return;
    }
}


