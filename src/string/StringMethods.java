package string;
public class StringMethods {

	public static void main(String[] args) {

		// 012345678
		String s = "ahmedabadahmedabad";

		System.out.println(s.length());// total character

		System.out.println(s.charAt(3));// e

		System.out.println(s.indexOf('m'));// 2
		System.out.println(s.indexOf('d'));// 4
		System.out.println(s.lastIndexOf('d'));// 17

		s = "Royal"; // RoYal => rOyAL
		System.out.println(s);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);// Royal

		String x = "jony jony yes papa";
		String y = "1,2,3,4,5,6,7,8";

		String xx[] = x.split(" ");
		String yy[] = y.split(",");
		System.out.println("split - x ");
		for (int i = 0; i < 4; i++) {
			System.out.println(xx[i]);
		}
		System.out.println("\nsplit - y ");
		for (int i = 0; i < yy.length; i++) {
			System.out.println(yy[i]);
		}
	}

}
