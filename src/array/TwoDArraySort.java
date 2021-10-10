package array;

import java.util.Scanner;

public class TwoDArraySort {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int a[][] = new int[3][3];
		int b[] = new int[9];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter number");
				a[i][j] = scr.nextInt();
			}
		}

		// print
		System.out.println("2D Array");
		for (int i = 0; i < 3; i++) {// 0 1 2
			for (int j = 0; j < 3; j++) {// 0 1 2
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

		// convert 2D into 1D
		// copy all 2D data into 1D
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[x++] = a[i][j];
				// x++
			}
		}

		// print 1D array
		System.out.println("1D array");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// sorting 1D
		int tmp;
		// 3 2 1
		// i j
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length - 1; j++) {
				if (b[j] > b[j + 1]) {
					tmp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tmp;
				}
			}
		}

		// print sorted array - 1d
		System.out.println("sorted array");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// copy all 1D data into 2D
		x = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = b[x++];
				// x++
			}
		}

		System.out.println("2D Array - Sorted");
		for (int i = 0; i < 3; i++) {// 0 1 2
			for (int j = 0; j < 3; j++) {// 0 1 2
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}

	}
}
