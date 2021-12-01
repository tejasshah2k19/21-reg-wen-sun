package inheritance;

public class LegalReturnType {

	public static void main(String[] args) {

	}
}

class A {
	protected Number game() {
		System.out.println("A::Game()");
		return 0;
	}
}

class B extends A {
	public Integer game() {
		System.out.println("B::Game()");
		return 0;
	}
}