import java.util.HashMap;

public class Person implements ProtoType<Person>{

	BankAccount bankAccount;
	
	Person partner;

	public Person(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Person getPartner() {
		return partner;
	}

	public void setPartner(Person partner) {
		this.partner = partner;
	}
	
	public Person clone()
	{
		Person p = new Person(bankAccount.clone());
		if (this.partner == null)
			return p;
			
		HashMap<Person, Person> cloneMap = new HashMap<Person, Person>();
		Person partner = this.partner;
		Person current = p;
		
		cloneMap.put(this, p);
			
		while (partner != null && !cloneMap.containsKey(partner)) {
			
			Person clonePartner = new Person(this.bankAccount.clone());
			
			current.setPartner(clonePartner);
					
			cloneMap.put(partner, clonePartner);
			
				partner = partner.partner;
				current = current.partner;
		}
		
		if (cloneMap.containsKey(partner))
		{
			current.partner = cloneMap.get(partner);
		}
		
		return p;
	}

	@Override
	public String toString() {
		return "Person [bankAccount=" + bankAccount + ", partner=" + "]";
	}
	
}
