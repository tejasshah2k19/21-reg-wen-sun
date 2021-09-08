package stringbufbuild;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = scr.nextLine();

		String x[] = str.split("\\s+");// 1 or many
		System.out.println(x.length);
	}
}
