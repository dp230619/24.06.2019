
public class Main {

	public static void main(String[] args) {

		Person p1 = new Person(new BankAccount(100000));
		Person p2 = new Person(new BankAccount(200000));
		Person p3 = new Person(new BankAccount(300000));
		p1.setPartner(p2);
		p2.setPartner(p3);
		p3.setPartner(p1);
		Person pc = p1.clone();
		System.out.println(p1);
		System.out.println(p1.getPartner());
		System.out.println(p1.getPartner().getPartner());
		System.out.println(p1.getPartner().getPartner().getPartner());
		
		System.out.println("time to clone result print");
		System.out.println(pc);
		System.out.println(pc.getPartner());
		System.out.println(pc.getPartner().getPartner());		
		System.out.println(pc.getPartner().getPartner().getPartner());
	}

}
