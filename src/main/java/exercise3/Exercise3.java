package exercise3;

public class Exercise3 {
	public static void main(String[] args) {

		new Panel(new Drawable[]{new Rectangle(new Point(20,20), new Point(120,150)),
			new Square(new Point(20,20),60)});
	}
}
