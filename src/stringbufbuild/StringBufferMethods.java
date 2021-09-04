package stringbufbuild;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("royal");
		sb.append("edu");
		System.out.println(sb);     
		sb.reverse();//
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder("ABCDEFGH");
		System.out.println(sb1);
		sb1.insert(2, "royal");
		System.out.println(sb1);

		sb1.delete(2, 7);// first inclusive last exclusive
		System.out.println(sb1);

	}
}
