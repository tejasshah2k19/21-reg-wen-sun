package exceptionD;

import java.util.Scanner;

public class CustomException2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter email");
		String email = scr.next();
		GoogleApi g = new GoogleApi();

		try {
			boolean ans = g.login(email, "");
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("done");

		//
	}
}

class GoogleApi {

	public boolean login(String email, String password) throws InvalidEmailException {

		if (email.contains("@")) {
			return true;
		} else {
			throw new InvalidEmailException();
		}

	}
}

class InvalidEmailException extends Exception {

	public InvalidEmailException() {
		super("Invalid email");
	}
}
