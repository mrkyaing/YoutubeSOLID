import java.util.ArrayList;
import java.util.List;

public class DoAction {

	public static void main(String[] args) {
		CalculateArea calculate=new CalculateArea();
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(2, 3);
		Square s=new Square(3);
		Parallelogram p=new Parallelogram(3,2);
		Rhombus rh=new Rhombus(2);
		List<IShape> shapes = new ArrayList<>();
		shapes.add(c);
		shapes.add(r);	
		shapes.add(s);	
		shapes.add(p);
		shapes.add(rh);
		calculate.calculateArea(shapes);
	}

}
