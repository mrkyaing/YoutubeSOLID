import java.util.List;

public class CalculateArea {
	
	public  void calculateArea(List<IShape> shapes) {
		for (IShape shape : shapes) {
			shape.getArea();
		}
	}
}
