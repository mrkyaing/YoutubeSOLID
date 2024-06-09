import java.util.List;

public class CalculateArea {
	
	public  void calculateArea(List<Object> shapes) {
		for (Object o : shapes) {
			if (o instanceof Circle) {
				System.out.println("Circle Area:" + ((Circle)o).getArea());
			} else if (o instanceof Rectangle) {
				System.out.println("Rectangle Area:" + ((Rectangle)o).getArea());
			}
			else if (o instanceof Square) {
				System.out.println("Square Area:" + ((Square)o).getArea());
			}
		}
	}
}
