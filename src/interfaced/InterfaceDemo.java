package interfaced;

public abstract class InterfaceDemo {

	protected abstract void aa();

	abstract void ss();// default -- can not go outside package

	public static void main(String[] args) {

//		TRAI t  = null;
//		System.out.println(t);
//		t.call();
	}
}

abstract class DOT {
	protected abstract void call();

	void sms() {

	}
}

class TRAI extends DOT {
	public void call() {

	}
}

class GOI {
	int k;
}

//interface - pure abstract class 
abstract interface RBI {

	public static final int ROI = 5;

	abstract void wid();

	public void dep();// private X
}

class SBI extends GOI implements RBI {
	void demat() {

	}

	public void wid() {
		System.out.println(RBI.ROI);//
	}

	public void dep() {

	}

}

class GUI {

}

interface SciCalc {

}

interface BasicCalc {
	// variable ==> public static final
	// method ==> public abstract
}

//child class having more than 1 parent -> multiple inheritance
class Calc extends GUI implements BasicCalc, SciCalc {

}
