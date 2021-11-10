package nonaccessmodifiers;

public class AbstractDemo {

	public static void main(String[] args) {
//		Laptop l = new Laptop();
		// l.restart();
		// l.booting();

	}
}
//abstract class -> can have abstract or non abstract method 
// can not create instance

abstract class Laptop {

	// non abstract -- defination -- logic
	void restart() {
		System.out.println("restart()");
	}

	// abstract method --> method having only declaration ---no body
	abstract void booting();// {}
}
//why abstract ? 

//department of telecommunication --> jio airtel vodafone 
abstract class DOT {

	abstract void calling();

	abstract void internet();

	abstract void sms();

	// abstract void upiPay();

	final void callRate() {
		float minCharge = 0.014f; // R - R R-Other-A -> // 100000 * 0.014 =>
	}

}

class Jio extends DOT {
	// calling sms internet .... ???
	void calling() {
	}

	void internet() {
	}

	void sms() {
	}

//	void callRate() {
//		float minCharge = 0;
//	}

	//
	void videoCall() {

	}

	void confernceCall() {
		// unlimited
	}
}

abstract class Vodafone extends DOT {
	void calling() {
	}

	void sms() {
	}

	void confernceCall() {
		// 5
	}
}

class Airtel extends DOT {
	void calling() {

	}

	void sms() {

	}

	void internet() {

	}

	void confernceCall() {
		// charge
	}
}
