package crypto;

public class CryptoPay {
	payment ref;

	CryptoPay(payment ref) {
		this.ref = ref;
	}

	void print1() {
		System.out.println("Your transaction is failed!!!!! You can pay through crypto");
		System.out.println("Transaction is being proceed by crypto......");
	}

}

class UPIPay {
	payment ref;

	UPIPay(payment ref) {
		this.ref = ref;
	}

	void print2() {
		System.out.println("Your transaction is failed...You can pay through UPI");
		System.out.println("Transaction is being proceed by UPI......");
	}

}
