
public class Pattern {

	public static void main(String[] args) {

		int row = 128;
		int sp = 0;
		for (int i = 1; i <= row; i=i*2) {
			for (int space = 1; space <=28-sp; space++) {
				System.out.printf(" ");
			}
			
			for(int k=1;k<i;k=k*2) {
				System.out.printf("%4d",k);
				
			}
			for(int j=i;j>=1;j=j/2) {
				System.out.printf("%4d",j);
			}
			System.out.printf("\n");
			sp=sp+4;
		}
	}
}
