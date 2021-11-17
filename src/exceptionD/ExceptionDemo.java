package exceptionD;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter two numbers");
		int x = 0;
		int y = 0;
		int z = 0;

		try {
			// file scannner db api -->
			x = scr.nextInt(); // Input
			y = scr.nextInt();
			z = x / y;// crash Ari
			System.out.println("DIV => " + z);// will not execute if exception generated
			//
		} catch (InputMismatchException e) {
			System.out.println("Please input only integer values");
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero in second number");
		} catch (Exception e) {
			System.out.println("Something Went Wrong Please Try After Sometime");
			// sendErroLogToDev(e);
		} finally {
			// gc
			System.out.println("I am always Execute");
		}
		System.out.println("END");

	}
}
