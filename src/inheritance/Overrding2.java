package inheritance;

public class Overrding2 {

	public static void main(String[] args) {

	}
}

//if child create a method having exactly same signature with parent. 
//accessspecifier ---> 
//private , default , protected , public 

class Alpha {
	// private --> { }
	private void add() {
		System.out.println("add()::alpha");
	}
	// car
	// chqBook->bank --> private --> mobile -->
}

class Beta extends Alpha {
	// car
	// chqBook->bank
	// add()::Alpha hidden
	void add() {
//		super.add();
		System.out.println("add()::Beta");
	}
}
