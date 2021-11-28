package exceptionD;

import java.util.Scanner;

public class Exception7 {

	public static void main(String[] args) {

//		Scanner scr = new Scanner(System.in); // object --> resource --> console --> input
//		scr.close();

		// try with auto resource collection
//		FileReader 
//		FileWriter

		try (Scanner scr = new Scanner(System.in);) {

		}
//		finally {
//			scr.close()
//		}
		try {
			System.out.println("logic");
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("some error");
		} catch (Exception e) {
			System.out.println("----");
		}

	}
}
