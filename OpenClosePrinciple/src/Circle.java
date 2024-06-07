
public class Circle implements IShape{
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		double result=Math.PI * radius * radius;
		System.out.println("Area of Circle:"+result);
		return  result;
	}
}
