package exceptionD;

public class Exception7_2 {

	public static void main(String[] args) {

		try {
			System.out.println("logic");
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("some error");
		}

	}
}
