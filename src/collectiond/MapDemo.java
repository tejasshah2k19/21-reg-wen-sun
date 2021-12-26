package collectiond;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		// In collection we can use any non primitive as data
		HashMap<Integer, String> hm = new HashMap<>();
		// key -- unique
		// value 0-- duplicate
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "three");
		hm.put(5, "one,two,three,four");

//		hm.put(5,arrayList);

		// dictionary
		hm.put(1, "one-one");// 1->overwrite

		System.out.println(hm);

		System.out.println(hm.get(2));
		System.out.println(hm.get(22));// null

		Set<Integer> hs = hm.keySet();// 1 2 3 4

		System.out.println(hs);

		for (Integer x : hs) {
			System.out.println(hm.get(x));
			if (hm.get(x).equals("three")) {
				System.out.println("three is associated with  -> " + x);
			}
		}

		System.out.println(hm.values());
		Collection<String> alist = hm.values();

		System.out.println(alist);

		ArrayList<String> alist2 = new ArrayList<>(hm.values());
		System.out.println(alist2);

		hm.isEmpty();// map empty --> boolean
		hm.remove(22);// remove 22 key from map
		hm.containsKey(22);// boolean -> check 22 key is present
		hm.containsValue(22);// boolean -> check 22 value is present
		System.out.println(hm.size());// return number of key count

	}
}
