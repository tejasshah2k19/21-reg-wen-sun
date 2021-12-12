package collectiond;

import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {

		// HashSet<Integer> hs = new HashSet<>();

		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(20);
		hs.add(200);
		hs.add(-20);
		hs.add(230);
		hs.add(120);
		hs.add(20);
		hs.add(200);
		hs.add(90);

		System.out.println(hs);

		System.out.println(hs.size());
		System.out.println(hs.remove(20));

		System.out.println(hs);

		TreeSet<Integer> headSet = (TreeSet<Integer>) hs.headSet(200);
		System.out.println(headSet);

		TreeSet<Integer> tailSet = (TreeSet<Integer>) hs.tailSet(200);
		System.out.println(tailSet);

		System.out.println(hs);

		// for each
		for (Integer x : hs) {
			System.out.println(x);
		}

		
	}
}
