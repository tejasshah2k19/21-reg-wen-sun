package nonaccessmodifiers;

public class StaticKeyWord {

	public static void main(String[] args) {
		System.out.println(A.y);

		A objA = new A();
		System.out.println(objA.y);
	}
}

//class  ->  ---- 
//method -> static  
//variable -> static 

class A {

	int k; // instance variable
	static int y = 10;// static/class variable

	// if we create 10 instance of class A then k will be created 10 times in the
	// memory
	// for the same , y will be only once in the memory.

	// instance variable can be access using instance/object only
	// static variable can be access using instance/object or class name

	// When to use static variable?
	// when we have common properties for all instance static is best
	// Bank ->
	// balance
	// branchCode*
	// bankCode*

	// non static -> instance call
	// static -> class call

	
	// When to use static method?
	// when we want to call method without instance
	// common logic -> utility class { Math -> sin() sqrt() } Math.random()
	// Math.sqrt()
	// covax --> input --> name , aadhar , year --> validation [ a-zA-Z , digit+8 ,
	// ]

	//static method can be call using instance/class name 
	
	void add() {
		System.out.println("non static -> A::add()");
		System.out.println("k => "+k); // non static method -> non static variable ? yes 
		System.out.println("Y => "+y); // non static method -> static variable ? yes 
	}

	static void sub() {
		System.out.println("static -> A::sub()");
//		System.out.println("k => "+k); // static method -> non static variable ? no 
		System.out.println("Y => "+y); // static method -> static variable ? yes 
	
	}

}
