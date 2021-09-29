package constructor;

public class InheritanceWithConstructor {

	public static void main(String[] args) {

		Parent parent = new Parent();
	}
}

class Parent {
	int p;

	Parent() {
		this(9);
		System.out.println("Parent()");
	}

	Parent(int x) {
		System.out.println("Parent(int)");
	}
}

class Child extends Parent {
	int c;

	Child() {
		System.out.println("Child()");
	}

	Child(int x) {
		System.out.println("Child(int)");
	}
}
