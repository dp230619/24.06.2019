
public abstract class Animal {

	protected String name;
	
	protected float height;
	
	public Animal(String name, float height) {
		super();
		this.name = name;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", height=" + height + "]";
	}
	
	protected IFly myFlyingAbility = null;
	
	public void setFlyingAbility(IFly howDoIFly)
	{
		this.myFlyingAbility = howDoIFly;
	}
	
	public void tryToFly()
	{
		this.myFlyingAbility.fly();
	}
	
}
