package array;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		int a[][];
		a = new int[3][3];// 0..2 0..2 R*C = totalData
		// 00
		// 01
		// 02
		// 10
		// 11
		// 12
		// 20
		// 21
		// 22
		//Parent p = new Child();
		//p.add(); 
		
		int sum = 0;
		Scanner scr = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {// 0 1 2
			for (int j = 0; j < 3; j++) {// 0 1 2
				// ij => 00 01 02
				// 10 11 12
				// 20 21 22
				System.out.println("Enter element");
				a[i][j] = scr.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {// 0 1 2
			for (int j = 0; j < 3; j++) {// 0 1 2
				// ij => 00 01 02
				// 10 11 12
				// 20 21 22
				System.out.print(a[i][j] + " ");
				sum = sum + a[i][j];
			}
			System.out.println("");
		}

		// sum of all elements in 2d Array
		System.out.println("addition => " + sum);
	}
}
