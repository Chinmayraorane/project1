package crypto;

public class User {
	private Cryptocurrency ref; // program to interface
	@SuppressWarnings("unused")
	private payment pt;
	private String name;
	private double amount;
	private String choice;

	User(Cryptocurrency ref) // composition ref=new bitcoin();
	{
		this.ref = ref;
	}

	Object show() {
		return ref.invest(amount); // polymorphism
	}

	public void addUser(payment pt) {
		this.pt = pt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

}
