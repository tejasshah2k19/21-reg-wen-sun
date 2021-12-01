package inheritance;

public class PolymorphicDemo {

	public static void main(String[] args) {

//		Legion lg  = new Legion();
//		lg.start();
//		lg.shutdown();

		// Parent p = new Child(); // polyumorphic object
		Laptop lg = new Legion(); // compiler --> Laptop
		lg.start();
		lg.shutdown();
//		lg.boost();

		Laptop lx;
		Legion ly = new Legion();
		lx = ly;

		Laptop lz = new Laptop();

//		ly = (Legion) lz; // ClassCastException
//		ly = (Legion)lx; 

		int a = 90;
		float f = 90.12f;

		int z = a;

		float x = a; // upcast
		int k = (int) x;// downcast

	}

}

class Laptop {
	void start() {
		System.out.println("Laptop:start()");
	}

	void shutdown() {
		System.out.println("Laptop:shutdown()");
	}
}

class Legion extends Laptop {
	void start() {
		System.out.println("Legion:start()");
	}

	void boost() {
		System.out.println("Legion::boost");
	}
}

class HP extends Laptop {
	void start() {
		System.out.println("Hp:start()");
	}

}