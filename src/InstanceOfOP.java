
public class InstanceOfOP {

	public static void main(String[] args) {

		Form f = new Form();
		MathsCalc m = new MathsCalc();
		SciCalcf sf = new SciCalcf();

		System.out.println(f instanceof Form);
		System.out.println(m instanceof MathsCalc);
		System.out.println(m instanceof Form);// ?

		System.out.println("Royal" instanceof String);

		String s = "royal";
		StringBuilder sb = new StringBuilder("royal");

		Form.someMethod(s);
		Form.someMethod(sb);
		System.out.println(null instanceof String);

	}
}

class Form {

	static void someMethod(Object obj) {
		if (obj instanceof String) {
			// logic
		} else {
			System.out.println("------");
		}
	}

}

class MathsCalc extends Form {

}

class SciCalcf extends Form {

}
