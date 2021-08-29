package string;

public class StringMethodsAgain {

	public static void main(String[] args) {

		String s1 = "royal";// 5200
		String s2 = "royal";// 5200
		String s3 = new String("royal");// 6300

		System.out.println(s1 == s2);// 5200 == 5200
		System.out.println(s1 == s3);// 5200 == 6300

		int len = s1.length();// int
		System.out.println(len);
		System.out.println(s1.length());

		// equals

		boolean bb = s1.equals(s2);// boolean { true | false }
		System.out.println(bb);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		String s4 = "Royal";// 7400

		System.out.println(s1 == s4); // 5200 == 7400
		System.out.println(s1.equals(s4)); // royal == Royal
		System.out.println(s1.equalsIgnoreCase(s4)); // true
	}
}
