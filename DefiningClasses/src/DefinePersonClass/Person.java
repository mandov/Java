package DefinePersonClass;

import DefiningClasses.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private java.util.List<BankAccount> acc;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BankAccount> getAcc() {
        return acc;
    }

    public void setAcc(List<BankAccount> acc) {
        this.acc = acc;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Person (String name, int age) {
        this(name,age,new ArrayList<>());
    }

    public Person (String name, int age, List<BankAccount> accounts){
        this.name = name;
        this.age = age;
        this.acc = accounts;
    }



    @Override
    public String toString() {
        return "Person" +
                "name='" + name + '\'' +
                ", age=" + age
                ;
    }
}
