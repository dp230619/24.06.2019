
public class Main {

	public static void main(String[] args) {

		Dog rex = new Dog("Rexi", 1.2f);
		
		rex.setFlyingAbility(new ICanFly());
		
		rex.tryToFly();
		
		rex.setFlyingAbility(new ICannotFly());
		
		rex.tryToFly();
		
		Bird twitty = new Bird("Twitty", 0.3f);
		
		twitty.setFlyingAbility(new ICanFly());
		
		twitty.tryToFly();
	}

}
