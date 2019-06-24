import javax.naming.OperationNotSupportedException;

public class Main {

	public static void main(String[] args) throws OperationNotSupportedException {

		Component root = new Composite("Canvas root");
		Component circle1 = new Leaf("Circle1");
		Component rectangle1 = new Leaf("Rectangle1");
		root.addChild(circle1);
		root.addChild(rectangle1);
		
		Component container1 = new Composite("container1");
		Component circle2 = new Leaf("Circle2");
		Component circle3 = new Leaf("Circle3");
		
		container1.addChild(circle2);
		container1.addChild(circle3);
		
		root.addChild(container1);
		
		root.draw("");
		
	}

}
