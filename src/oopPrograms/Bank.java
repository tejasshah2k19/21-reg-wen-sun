package oopPrograms;

public class Bank {

	public static void main(String[] args) {

		Customers c = new Customers();

		c = null;

		System.gc();// request
		// gc

		// end
	}
}

class Customers {

}
