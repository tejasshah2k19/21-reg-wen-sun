package inheritance;

public class SingleLevel {

	public static void main(String[] args) {

		SciCalc scObj = new SciCalc();
		scObj.cube(3);
		scObj.add(12, 12);
		scObj.sub(12, 10);
	}
}

//single level inheritance 
//parent-super-base  
class BasicCalc {

	void add(int a, int b) {
		System.out.println("add => " + (a + b));
	}

	void sub(int a, int b) {
		System.out.println("sub => " + (a - b));
	}

}

//child-sub-derived  
class SciCalc extends BasicCalc {
	void cube(int a) {
		System.out.println("cube => " + (a * a * a));
	}
}

class TigoCalc extends SciCalc{
	
}





