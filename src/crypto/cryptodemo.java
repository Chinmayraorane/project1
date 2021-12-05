package crypto;

import java.util.Scanner;

public class cryptodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User obj = null;
		payment p = new payment();
		CryptoPay pay1 = new CryptoPay(p);                                       // passing referenece of payment inside CryptoPay
		UPIPay pay2 = new UPIPay(p);                                            // passing referenece of payment inside UPIPay

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int status = 1;
		do {
			System.out.println(
					"***************************************************************************************************");
			System.out.println("Welcome to the cryptocurrency App");
			System.out.println("1.Add new user");
			System.out.println("2.Existing user");
			System.out.println("3.Payment for product/services");
			System.out.println("4.For deleting account");
			System.out.println("Enter any of the number");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("Enter your name");
				String name = sc.next();
				System.out.println("Select one of your choice in which you want to invest");
				System.out.println("Enter 1 for bitcoin or Enter 2 for etherum ");
				int choice = sc.nextInt();
				if (choice == 1) {
					obj = new User(new bitcoin());                                              // upcasting
					obj.setName(name);                                                         // late binding
					obj.setChoice("bitcoin");

				} else if (choice == 2) {
					obj = new User(new etherum());
					obj.setName(name);
					obj.setChoice("Etherum");

				} else {
					break;
				}
				System.out.println("Do you want to invest amount ?");
				System.out.println("Enter 1 to confirm or Enter 2 to exit:");
				int confirm = sc.nextInt();
				if (confirm == 1) {
					System.out.println("Enter amount you want to invest in rupees");
					Double amount = sc.nextDouble();
					obj.setAmount(amount);
					System.out.println("Amount has been added successfully...");
					break;
				} else {
					break;
				}

			case 2:
				try {
					System.out.println("Enter your name");
					String name1 = sc.next();

					if (name1.equalsIgnoreCase(obj.getName())) {
						System.out.println("Hello" + " " + obj.getName());
						System.out.println("You have invested in " + obj.getChoice());

						System.out.println("Your Investment amount is " + obj.getAmount());

						// System.out.println("Your Investment amount is "+obj.getAmount());
						System.out.println(
								"Your crypto amount is " + String.format("%.5f", obj.show()) + " " + obj.getChoice());
						if (obj.getChoice() == "bitcoin")
							System.out.println("Your amount with profit/loss in rupees is "
									+ String.format("%.2f", (double) obj.show() * 4600000));
						else
							System.out.println("Your amount with profit/loss in rupees is "
									+ String.format("%.2f", (double) obj.show() * 343000));
						break;
					}

					else
						break;

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("Your account doesn't exist!!!");
				}
				break;

			case 3:

				p.perform(obj);                                              // passing user reference to payment class
				System.out.println("Enter your name");
				String name3 = sc.next();
				if (name3.equalsIgnoreCase(obj.getName())) {
					System.out.println("Hello" + " " + obj.getName());
					System.out.println(
							"Your crypto amount is " + String.format("%.5f", obj.show()) + " " + obj.getChoice());
					System.out.println("Please enter ammount for transaction");
					double amt = sc.nextDouble();
					p.setAmt(amt);
					// pay1=null;                                           // Aggregation
					if (pay1 == null) {
						pay2.print2();                                      // if reference is null then another payment method will invoked.
					}
					System.out.println("<b>Your transaction has done successfully..</b>");
					System.out.println("Your total amount is now Rs." + String.format("%.2f", p.online()));
					System.out.println("Thank you..");

				}
				break;

			case 4:
				System.out.println("Enter your name");
				String name4 = sc.next();
				if (name4.equalsIgnoreCase(obj.getName())) {
					obj = null;                                            // composition -ref of user is made null.
					System.out.println("<b>Your account is deleted.....</b>");

				}
				break;
			default:
				System.out.println("Wrong choice...");
			}
			System.out.println("Do you want to continue (1.yes/2.No): ");
			status = sc.nextInt();
		} while (status == 1);
		System.out.println("Execution completed successfully... ");
	}

}
