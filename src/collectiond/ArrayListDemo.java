package collectiond;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		Vector<Integer> v = new Vector<>();
		
		

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
//		list.add("royal");
		list.add(22);

		System.out.println(list);// Iterable

		System.out.println(list.get(0)); // list[0]
		System.out.println(list.get(3));

		list.remove(0);
		System.out.println(list.get(0)); // list[0]
		System.out.println(list.get(2));

		System.out.println(list.size());

	}
}
