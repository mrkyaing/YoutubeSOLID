
public class Rhombus implements IShape {
private double diagonal;

	public Rhombus(double diagonal) {
	this.diagonal = diagonal;
}

	@Override
	public double getArea() {
		double result=(this.diagonal*this.diagonal)/2;
		System.out.println("Area of Rhombus:"+result);
		return result;
	}

}
