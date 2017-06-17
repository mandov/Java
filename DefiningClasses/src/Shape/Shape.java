package Shape;

public abstract class Shape {

	public double width;
	public double height;

	public Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public abstract double calculateSurface();
}
