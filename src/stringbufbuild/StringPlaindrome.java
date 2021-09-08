package stringbufbuild;

import java.util.Scanner;

public class StringPlaindrome {

	public static void main(String[] args) {

		String str = "", rev = "";
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String");
		str = scr.next();// royal

		StringBuffer sb = new StringBuffer(str);
		rev = sb.reverse().toString();

		if (str.equals(rev)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

	}
}
