package stringbufbuild;

public class StringBufferDemo {

	public static void main(String[] args) {
		//StringBuffer  ===  StringBuilder 
		
//		StringBuffer sb = new StringBuffer("royaledu");
//		System.out.println(sb);
//		sb.append("AHMEDABAD");
//		System.out.println(sb);
//	
//		String s = new String("royaledu");
//		System.out.println(s);
//		s.concat("AHMEDBAD");
//		System.out.println(s);
//	
	
	
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("java");
		System.out.println("----------java----append------");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("edu");
		sb.append("12345678987654321");
	
		
		
		
		
		
	
	
	}
}
