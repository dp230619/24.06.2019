import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

	List<Component> children = new ArrayList<Component>(); 
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void addChild(Component c) {
		children.add(c);
	}

	@Override
	public void removeChild(Component c) {
		children.remove(c);	
	}

	@Override
	public List<Component> getChilds() {
		return children;
	}

	@Override
	public void draw(String space) {
		System.out.println(space + this.name);
		for (Component c : this.children) {
			c.draw(space + "    ");
		}
		
	}

}
