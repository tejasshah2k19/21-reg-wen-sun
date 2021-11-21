package exceptionD;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {

		String ccNum;
		int cvv;
		int expYear;

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter CC number");
		ccNum = scr.next();
		System.out.println("Enter cvv");
		cvv = scr.nextInt();
		System.out.println("Enter ExpYear");
		expYear = scr.nextInt();

		PaymentGateway pay = new PaymentGateway();
		try {
			if (pay.chargeCreditCard(ccNum, cvv, expYear)) {
				System.out.println("order placed....");
			}
		} catch (CreditCardException e) {
			// System.out.println(e.getMessage());// PA-16
			if (e.getMessage().equals("PA-16")) {
				System.out.println("Please Enter Valid CreditCard Number");
			} else if (e.getMessage().equals("PA-123")) {
				System.out.println("Please Enter Valid CVV Number");
			}
			if (e.getMessage().equals("PA-YEAR")) {
				System.out.println("It seems your card was expired or you input invalid expYear");
			}

		}
	}
}
