
public class Rectangle implements IShape{
	private int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		double result=width * height;
		System.out.println("Area of Rectangle:"+result);
		return  result;
	}
}
