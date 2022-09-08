package Assignment;

class Circle{
	private double radius;
	private double area;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return area;
	}
	
	public void calculateArea() {
		this.area = 3.14*radius*radius;
	}
	
}

public class CircleMain {
	
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		circle.calculateArea();
		System.out.println(circle.getArea());
	}

}
