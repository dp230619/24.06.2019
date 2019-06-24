
public class Circle implements ProtoType<Circle>{

	private Point center;
	
	private double area;

	public Circle(Point center, double area) {
		super();
		this.center = center;
		this.area = area;
	}

	public Point getCenter() {
		return center;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", area=" + area + "]";
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public Circle clone()
	{
		return new Circle(center.clone(), this.area);
	}
	
	
}
