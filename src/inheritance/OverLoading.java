package inheritance;

public class OverLoading {

	public static void main(String[] args) {
		Santa s = new Santa();
		s.smile();
		s.smile(12);
	}
}
//overloading in a single class 
class Santa {

	void smile() {
		System.out.println("smile()");
	}

	void smile(int a) {
		System.out.println("smile(a)");
	}
}


class Parent{
	void add() {
		System.out.println("add()::parent");
	}
}
//overloading 
class Child extends Parent{
	//hidden void add(){} -> parent 
 	void add(int a) {
		System.out.println("add()::child");
	}
}