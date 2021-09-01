package string;

import java.util.Scanner;

public class ToggleDemo {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = new Scanner(System.in).nextLine();// royal
		String toggleStr = "";
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);// R

			if (x >= 65 && x <= 90) {
				x = (char) (x + 32);// casting ==> explicit
				toggleStr = toggleStr + x;
			} else if (x >= 'a' && x <= 'z') {
				x = (char) (x - 32);// casting ==> explicit
				toggleStr = toggleStr + x;
			} else {
				toggleStr = toggleStr + x;
			}

		}
		System.out.println(toggleStr);

	}
}
