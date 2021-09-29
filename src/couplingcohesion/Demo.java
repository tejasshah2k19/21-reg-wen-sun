package couplingcohesion;

public class Demo {

	public static void main(String[] args) {
		B objB = new B();
		objB.addition();
	}
}

//tightly coupled --> bad practice 
class A {
	void add() {
		System.out.println("add()");
	}
}

class B {
	void addition() {
		A obj = new A();
		obj.add();
	}
}

//cohesion -----> high 
class BasicCalc {
	// add
	// sub
	// mul
	// div
}

class SciCalc extends BasicCalc {
	// sqrt
	// sin
	// cons
}

//----------------------------------------

class Manager {
	// admissions()
}

class Faculty {
	// exams()
}

class Accountant {
	// fees()
}
