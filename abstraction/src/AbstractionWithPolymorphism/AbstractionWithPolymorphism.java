package AbstractionWithPolymorphism;

abstract class Shape {
	abstract void draw();
}

// Concrete subclass 1
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Circle");
	}
}

// Concrete subclass 2
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

public class AbstractionWithPolymorphism {
	public static void main(String[] args) {
		// Abstract class reference holding a Circle object
		Shape shape1 = new Circle();
		shape1.draw(); // Output: Drawing a Circle

		// Abstract class reference holding a Rectangle object
		Shape shape2 = new Rectangle();
		shape2.draw(); // Output: Drawing a Rectangle

		// Polymorphism in action
		Shape[] shapes = { new Circle(), new Rectangle() };

		for (Shape shape : shapes) {
			shape.draw(); // Output varies depending on actual object
		}
		shape1 = new Rectangle();
		shape1.draw(); // Output: Drawing a Rectangle
	}
}
