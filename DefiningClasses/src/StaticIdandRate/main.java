package StaticIdandRate;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, BankAccount> map = new HashMap<>();
        String command = input.nextLine();

        while (!command.equals("End")) {
            String[] commands = command.split(" ");
            String commandType = commands[0];
            switch (commandType) {
                case "Create":
                    createAcc(map);
                    break;
                case "Deposit":
                    deposit(map, commands);
                    ;
                    break;
                case "SetInterest":
                    setInterest(commands[1]);
                    break;
                case "GetInterest":
                    getInterest(map, commands);
                    break;
            }
            command = input.nextLine();
        }

    }

    private static void deposit(HashMap<Integer, BankAccount> map, String[] commands) {
        double amount = Double.valueOf(commands[2]);
        int id = Integer.valueOf(commands[1]);
        try {
            if (map.containsKey(id)) {
                map.get(id).deposit(amount);
                System.out.printf("Deposit %s in ID%s ", amount, id);
            } else {
                System.out.print("This id does not exist !!!");
            }
        } catch (IllegalArgumentException iae) {
            System.out.print("You need to enter positive number !");
        }
    }

    private static void setInterest(String command) {
        double interest = Double.valueOf(command);
        BankAccount.setInterestRate(interest);
    }

    private static void getInterest(HashMap<Integer, BankAccount> map, String[] commands) {
        int id = Integer.valueOf(commands[1]);
        int years = Integer.valueOf(commands[2]);
        System.out.printf("%.2f", map.get(id).getInterestRate(years));
    }


    private static void createAcc(HashMap<Integer, BankAccount> map) {
        BankAccount acc = new BankAccount();
        map.put((BankAccount.getId()), acc);
        System.out.print(map.get(BankAccount.getId()));
    }
}


