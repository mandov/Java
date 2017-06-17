package Animals;

public abstract class Animal {

	private int age;
	private String name;
    private Gender gender;
    
	public Animal(int age, String name,Gender gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public abstract String makeSounds();
	
	@Override
	public String toString() {
		return  " Name: " + this.name +  " Age: " + this.age + " Gender " + this.gender;
	}
}
