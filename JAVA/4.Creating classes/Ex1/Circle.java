
public class Circle {

	private int x;
	private int y;
	private int radius;
	public static final double pi = 3.14;
	private static int number_of_circles = 0;

	Circle() {
		this.x = 5;
		this.y = 5;
		this.radius = 3;
		number_of_circles++;
	}

	Circle(int x, int y) {
		this.x = x;
		this.y = y;
		this.radius = 4;
		number_of_circles++;
	}

	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		number_of_circles++;
	}

	public Circle copy() {
		Circle new_circle = new Circle();
		new_circle.x = this.x;
		new_circle.y = this.y;
		new_circle.radius = this.radius;
		return new_circle;
	}

	public boolean cocentric(Circle c) {
		if ((this.x == c.x) && (this.y == c.y)) {
			return true;
		} else
			return false;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int setRadius(int radius) {
		return this.radius = radius;
	}

	public int getRadius() {
		return this.radius;
	}

	public void print() {
		System.out.println("* I'm a circle at point (" + x + "," + y + ") with radius " + radius);
		System.out.println("Area=" + calculateArea());
		System.out.println("Perimeter=" + calculatePerimeter());
		System.out.println("number of circles= " + number_of_circles);
	}

	public double calculateArea() {
		double area = pi * this.radius * this.radius;
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = 2 * pi * this.radius;
		return perimeter;
	}
}
