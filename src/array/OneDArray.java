package array;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a[] = new int[5]; // 20 byte
		// a.length ==> 5
		// scan
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter number");
			a[i] = scr.nextInt();
		}
//		a[0] = 0;  // value 0 -> memory release // 20 bytes -- no memory release 
		// print
		System.out.println("Elements in an array...");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}
