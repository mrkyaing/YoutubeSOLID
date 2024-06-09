
public class Circle {
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
