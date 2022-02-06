package innerclassd;

import java.awt.Button;

public class MethodLocalInnerClass {

	public static void main(String[] args) {

		OuterMethod o = new OuterMethod();
		o.createInner(); // Arr --> res get bean 
	}

}
//outer$inner.class 
//outer$1inner.class 

class OuterMethod {
	int outer = 10;
	Button btn;

	void createInner() {

		class InnerClassInMethod {

			int in = 20;

			void seeOuter() {
				System.out.println(outer);
			}

		}

		InnerClassInMethod ici = new InnerClassInMethod();
		ici.seeOuter();
	}

	void seeInner() {

	}
}
