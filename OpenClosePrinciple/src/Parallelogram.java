
public class Parallelogram implements IShape{
private double base,height;

public Parallelogram(double base, double height) {
	this.base = base;
	this.height = height;
}

@Override
public double getArea() {
	double result=base * height;
	System.out.println("Area of Parallelogram:"+result);
	return  result;
}
}
