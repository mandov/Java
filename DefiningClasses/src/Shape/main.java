package Shape;

public class main {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(2.2);
		shapes[1] = new Triangle(3, 5);
		shapes[2] = new Rectangle(1, 2);
		double[] results = new double[3];
		for (int i = 0; i < results.length; i++) {
			results[i] = shapes[i].calculateSurface();
		}
		
		for (double d : results) {
			System.out.println(d);
		}
	}
}