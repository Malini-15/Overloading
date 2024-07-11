package dayseven;

public class Square extends Shape {
	private double side;
	public Square(double side) {
		this.side=side;
	}
	public void draw() {
		System.out.print("Drawing a square with side" +side);
	}
	public void erase() {
		System.out.print("Erasing a square with side" +side);
	}
}
