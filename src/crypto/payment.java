package crypto;

public class payment {
	double amt;
	double amttrans;
	User ref;

	void setAmt(double amttrans) {
		this.amttrans = amttrans;
	}

	void perform(User ref) // User ref=obj;
	{
		this.ref = ref;
	}

	double online() {

		if (ref.getChoice() == "bitcoin") {

			amt = (((double) ref.show()) * 4600000) - amttrans;
		}

		else if (ref.getChoice() == "Etherum") {

			amt = (((double) ref.show()) * 343000) - amttrans;

		}
		return amt; // return to main
	}

}
