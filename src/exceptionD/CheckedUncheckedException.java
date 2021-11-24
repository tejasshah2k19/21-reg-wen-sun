package exceptionD;

import java.io.File;
import java.io.IOException;

public class CheckedUncheckedException {

	public static void main(String[] args) throws IOException {

		int a = 90, b = 0, c = 0;

		c = a / b; // ArithmeticException -- unchecked exception

		File f = new File("demo.txt");

//		try {
//			f.createNewFile();// IOException -- checked exception 
//		} catch (IOException e) {
//			System.out.println("Something went wrong...");
//		}

		f.createNewFile();//

		// jar

	}

}
