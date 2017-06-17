package Shape;

public class Triangle extends Shape {

	public Triangle(double width, double height) {
		super(width, height);
		
	}

	@Override
	public double calculateSurface() {
		return (this.height * this.width) / 2;
	}

}
