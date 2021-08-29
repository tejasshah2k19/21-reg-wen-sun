package string;

import java.util.*;

public class StringDemoAgain {

	int x;// instance -- long -- heap

	public static void main(String[] args) {
		// local -- temp --- stack
		Scanner scr = new Scanner(System.in);
		String s = "royal"; // String pool ==>
		String z = "goyal";
		String t = "royal";
		String u = "royal";
		String n = new String("royal");

		s = "edu";
		n = "royaledu";

		String a = "edu";
		n = new String("edu");
		t = null;
		u = null;

		// gc

		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		System.out.println(n);
		System.out.println(z);

	}
}
