package CreatingConstructors;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person() {
        this(2);
    }

    public Person(int age) {
        this("No name", age);
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }
}

