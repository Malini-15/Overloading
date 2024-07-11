package dayseven;

public class Triangle {
	private double base;
	private double height;
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}
	public void draw() {
		System.out.print("Drawing a triangle with base" +base+ "and height" +height);
	}
	public void erase() {
		System.out.print("Erasing a triangle with base" +base+ "and height" +height);
	}
}
