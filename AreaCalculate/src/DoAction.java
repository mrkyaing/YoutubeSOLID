import java.util.ArrayList;
import java.util.List;

public class DoAction {

	public static void main(String[] args) {
		CalculateArea calculate=new CalculateArea();
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(2, 3);
		Square s=new Square(3);
		List<Object> shapes = new ArrayList<>();
		shapes.add(c);
		shapes.add(r);	
		shapes.add(s);	
		calculate.calculateArea(shapes);
	}

}
