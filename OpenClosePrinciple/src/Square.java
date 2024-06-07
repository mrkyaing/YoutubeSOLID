
public class Square implements IShape{
	private int radius;

	public Square(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		double result=radius * radius;
		System.out.println("Area of Square:"+result);
		return  result;
	}
}
