package Animals;

public class main {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Cat(5,"Yrni",Gender.MALE);
		animals[1] = new Frog(10,"Kyrmit",Gender.FEMALE);
		animals[2] = new Dog(3,"Lara",Gender.FEMALE);

		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

}
