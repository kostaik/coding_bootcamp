
public class TestCircles {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		c1.setX(10);
		c1.setY(11);
		c1.setRadius(5);
		c1.print();

		Circle c2 = new Circle(1, 2);
		c2.print();

		Circle c3 = new Circle(5, 6, 7);
		c3.print();

		Circle c4 = c1.copy();
		c4.print();


		System.out.println(c1.cocentric(c2));
	}

}
