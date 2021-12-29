package genericd;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericDemo {

	public static void main(String[] args) {

//		ArrayList<Integer> i;
//		ArrayList<String> s;
//		
		Calc<Integer> c = new Calc(12);
		c.add(20, 30);

		Calc<Float> c1 = new Calc(12);
		c1.add(20.02f, 30.03f);

//		Calc<String> c2 = new Calc(12);
//		c2.add("raja", "ram");

//		Calc<Scanner> c3 = new Calc(12);
//		c3.add(null, null);

		Calc2<String, Integer> tk = new Calc2();
	}
}

//Integer Float Byte Long Double 
class Calc<T extends Number> {
	T x;
	T y;

	Calc(T x) {
		this.x = x;
	}

	void add(T a, T b) {
		System.out.println("add()");
	}

	T getResp() {

		return null;
	}
}

class Calc2<T, K> {

}