package exceptionD;

import java.util.Date;

public class PaymentGateway {

	public boolean chargeCreditCard(String ccNum, int cvv, int expYear) {
		// 1234567890123456
		if (ccNum.length() != 16) {
			// runtime error --> 16 --> PA-16
			throw new CreditCardException("PA-16");
		} else if (cvv != 123) {
			// runTimeError --> 123 --> PA-123
			throw new CreditCardException("PA-123");
		} else if (expYear < 2021) {
			// runTimError --> year --> PA-YEAR
			throw new CreditCardException("PA-YEAR");
		} else {

			// payment deducted

		}
		return true;
	}
}
//custom exception class 

class CreditCardException extends RuntimeException {
	public CreditCardException(String msg) {
		super(msg);
	}
}
