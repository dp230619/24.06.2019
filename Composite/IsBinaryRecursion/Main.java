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
		
		System.out.println(isBinary(root));
		
		
		Component root2 = new Composite("Canvas root");
		Component circle2_1 = new Leaf("circle2_1");
		Component rectangle2_1 = new Leaf("rectangle2_1");
		//Component rectangle2_1_1 = new Leaf("rectangle2_1");
		root2.addChild(circle2_1);
		root2.addChild(rectangle2_1);
		//root2.addChild(rectangle2_1_1);
		
		System.out.println(isBinary(root2));
		
	}
	
	private static boolean isBinary(Component c)
	{
		if (!c.isBinary())
			return false;
		
		if (c.getChilds() != null && c.getChilds().size() == 2) // can skip this check: c.getChilds().size() == 2
		{
			return isBinary(c.getChilds().get(0)) && isBinary(c.getChilds().get(1)); 
		}
		
		return true;
	}

}
