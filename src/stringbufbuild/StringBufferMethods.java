package stringbufbuild;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("royal");//sync 
		sb.append("edu");//royaledu 
		System.out.println(sb);     //royaledu 
		sb.reverse();//udelayor 
		System.out.println(sb);//udelayor 

		String x = sb.toString(); 
		
		
		StringBuilder sb1 = new StringBuilder("ABCDEFGH");//non-sync 
		System.out.println(sb1);
		sb1.insert(2, "royal");
		System.out.println(sb1);

		sb1.delete(2, 7);// first inclusive last exclusive
		System.out.println(sb1);

	}
}
