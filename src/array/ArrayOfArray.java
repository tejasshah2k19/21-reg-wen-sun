package array;

import java.util.Scanner;

public class ArrayOfArray {

	public static void main(String[] args) {
		// row --> fix
		// columns --> row --> [n1,n2,n3]

		int a[][] = new int[3][];// 3 row
		a[0] = new int[3]; // 0th row will get 3 columns
		a[1] = new int[2]; // 1st row will get 2 col
		a[2] = new int[1]; // 2nd row will get 1 col

		Scanner scr = new Scanner(System.in);

//		System.out.println(a.length);//3
//		System.out.println(a[0].length);//3
//		System.out.println(a[1].length);//2
//		System.out.println(a[2].length);//1
//		
		// 3*4
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter value for a[" + i + "][" + j + "]");
				a[i][j] = scr.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
