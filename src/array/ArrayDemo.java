package array;

public class ArrayDemo {

	public static void main(String[] args) {

		int a[]; // declaration
		a = new int[5]; // init -- memory allocation
		int b[] = new int[5];
		int c[][] = new int[3][4]; // matrix --> [3] => row [4] => col
		int[][] k = new int[4][4];
		int[] kk[];
		int j[] = new int[6]; // new

		// ---------------------------------------------
		// jagged array
		
		int rr[][] = new int[3][]; 
		rr[0] = new int[3];
		rr[1] = new int[4];
		rr[2] = new int[2];

	}
}
