package collectiond;

import java.util.Comparator;
import java.util.TreeSet;

public class IntegerSorting {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>(new IntegerSort());
		ts.add(12);
		ts.add(-12);
		ts.add(122);
		ts.add(-120);
		ts.add(212);
		ts.add(-212);

		System.out.println(ts);

	}
}

class IntegerSort implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {

		if (o1 > o2) {
			return -1;// 1
		} else if (o1 < o2) {
			return 1;// -1
		} else {
			return 0;
		}

	}

}