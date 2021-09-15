package inheritance;

public class Task {
	public static void main(String[] args) {
		Square sq = new Square();// static
		sq.print();//
//		sq.accessPrintRect();
//		sq.accessShape();
	}
}

class Shape {

	void print() {
		System.out.println("this is shape");
	}

	void printShape() {
		System.out.println("shape2()");
	}
}

class Rectangle extends Shape {
	void print() {

		System.out.println("this is rect");
		super.print();
	}

	void accessShape() {
		super.print();
	}
}

class Circle extends Shape {
	void print() {
		System.out.println("this is circle");
	}
}

class Square extends Rectangle {
	void print() {

		System.out.println("Square is a rectangle");
		super.print();
	}

	void accessPrintRect() {
		super.print();
	}
	
	void print(int a) {
		System.out.println("print => "+a);
	}
}
