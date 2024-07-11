package dayseven;

class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public void draw() {
		System.out.print("Drawing a circle with radius" +radius);
	}
	public void erase() {
		System.out.print("Erasing a circle with radius" +radius);
	}
}