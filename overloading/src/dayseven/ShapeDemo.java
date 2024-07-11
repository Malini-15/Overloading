package dayseven;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[]  shape=new Shape[3];
		Circle[] shapes;
		shapes[0] = new Circle(5.0);
		shapes[1] = new Triangle(4.0, 3.0);
		shapes[2] = new Square(6.0);

		for (Shape shape1:shapes) {
			shape1.draw();
			shape1.erase();
			System.out.print("--------------");
		}
	}

}
