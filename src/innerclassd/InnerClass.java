package innerclassd;

public class InnerClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.seeInner();

//		Outer.Inner inner = new Outer().new Inner();
		Outer.Inner inner = o.new Inner();
	}

}

//Outer.class 
//public default 
class Outer {
	int out = 10;

	// Outer$Inner.class
	class Inner {
		int in = 20;

		void seeOuter() {
			System.out.println("out ==> " + out);
			System.out.println("in ===> " + in);
			// seee(12);
		}
	}

	void seeInner() {
		Inner inner = new Inner();
		System.out.println("in => " + inner.in);
		inner.in = 1234;
		System.out.println("in => " + inner.in);
		inner.seeOuter();
		// System.out.println("in => "+in);
	}

}

//
//struct Std{
//	char name[20]; 
//		struct result{
//				maths,sci,perc; 
//			
//		}r;
//	
//};
//struct std s1,s2,s3;
//s1.r.maths  =12 
//s2.r 