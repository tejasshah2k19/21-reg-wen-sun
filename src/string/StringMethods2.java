package string;

public class StringMethods2 {

	public static void main(String[] args) {
		// length
		// ==
		// equals
		// equalsIgnoreCase
		String s1 = "royal";
		String s2 = "ROYAL";

		System.out.println(s1.compareTo(s2));// int --> 0 | diff
		System.out.println(s1.compareToIgnoreCase(s2));

		String s3 = "Jony jOny Yes PAPA";
		s3.toUpperCase();

		System.out.println(s3);

		String s4 = s3.toUpperCase(); // toLowerCase()
		System.out.println(s3);
		System.out.println(s4);

		// 0123456789
		String s5 = "jai jawan jai kisan";
		System.out.println(s5.charAt(5));// 0
//		System.out.println(s5.charAt(120));//exception 

		System.out.println(s5.indexOf('i'));// 2

		System.out.println(s5.lastIndexOf('i'));// 15
		System.out.println(s5.indexOf("wan"));// 6
		System.out.println(s5.indexOf("joker"));// -1

	
		//1) Take a string from the user count vowel and total words from it.
		//2) Take a string from user and search given substring is present or not ?
						//if present then count how many times? 
			//Enter string : 
			//jony jony yes papa 
			//Enter substring to Search :
			//ony 
			//ony found 2 times 
		
		//3) Take a string from and make it toggle.
			//Enter string 
			//roYal EdUCAtion 
			//output :
			//ROyAL eDucaTION 
		
		
	
	
	
	
	
	}
}
