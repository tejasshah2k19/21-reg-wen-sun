package string;

public class StringMethods3 {

	public static void main(String[] args) {
		String s1 = "    royal education ahmedabad india            ";
		String s2 = "royal,education,ahmedabad,india";

//		s1.split("\\s");

		s1 = s1.trim();// will remove space from beg and end not inBetween of the data
		String s1Split[] = s1.split(" ");
		System.out.println(s1Split.length);// size
		System.out.println(s1.length());

		String s2Split[] = s2.split(",");

		for (int i = 0; i < s2Split.length; i++) {
			System.out.println(s2Split[i]);
		}
	
	
	
		char x[]= {'r','o','y','a','l'};
		String str = new String("royal");//String
		String strX = new String(x);//char array 
		
				  //012345678901234567
		String g = "jony jony yes papa";
		System.out.println(g.substring(5));
		System.out.println(g.substring(5,15));//first arg inclusive , second arg excl 
		
		System.out.println(g.replace('j', 'r'));
		System.out.println(g.replace("jony", "rony"));

	}
}
