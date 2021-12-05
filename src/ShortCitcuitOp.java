
public class ShortCitcuitOp {

	public static void main(String[] args) {
       doubleAnd();// 9 9 
       singleAnd();// 10 10 
	}

	static void singleAnd() {
		int a = 9,b=9;
		//& => all conditions must be true -- all conditions will test by if  
		if (a > b & a++ > b++) {  // false & false => false 
			System.out.println("inside if");
		}

		System.out.println(a);//10
		System.out.println(b);//10

	}
	//&& -> shortCircuit operator 
	static void doubleAnd() {
		int a = 9,b=9; 
		
		//all conditions muse be true -- once any condition return false rest are ignored
		if (a > b && a++ > b++) {
			System.out.println("inside if");
		}

		System.out.println(a);//9
		System.out.println(b);//9

	}
}












