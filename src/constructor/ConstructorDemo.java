package constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		A obj = new A();  //20,25.5 -> int,double
	
		 
		obj.display();
	}
}

class A {
	// instance
	byte b;// 0
	short s;// 0
	char c;// null char
	int i;// 0
	long l;// 0
	float f;// 0.0
	double d=1200.1200;// 0.0
	boolean bb;// false

	A() {
		this(20,25.5f);
		System.out.println("A()");
		b = 90;
		s = 900;
		c = 'X';

	}

	A(int a, float x) {
	   // this();//jump to A() 
		System.out.println("A(int,float)");
		b=120;
		i = a;
		f = x;
	}

	void display() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bb);

	}
}