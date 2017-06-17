package CreatingConstructors;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Person[] persons = new Person[size];

        for (int i = 0; i < size; i++) {
            persons[i] = new Person(input.next(), input.nextInt());
        }

        Arrays.sort(persons);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 30) {
                System.out.printf("%s %n", persons[i]);
            }
        }
    }
}
