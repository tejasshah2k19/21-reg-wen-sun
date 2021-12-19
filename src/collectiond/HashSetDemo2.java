package collectiond;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		TreeSet<Integer> hs = new TreeSet<>();
		hs.add(120); // true
		hs.add(12); // t
		hs.add(100);// t
		hs.add(10);// t
		hs.add(120);// false
		hs.add(-120);// true
		System.out.println(hs);
		System.out.println(hs.size());
		TreeSet<String> ts = new TreeSet<>();
		ts.add("raju");
		ts.add("raju");
		ts.add("Raju");
		System.out.println(ts);

		// how Set will identify duplicates????
		// raju raju ?
		// 10 10

		Player p1 = new Player("vidit", 120);
		Player p2 = new Player("vraj", 120);
		Player p3 = new Player("sachin", 120);
		Player p4 = new Player("sachin", 120);

		HashSet<Player> players = new HashSet<>();

		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);

		System.out.println(players.size());
//		System.out.println(p1);// package.class@45ab8f
//		System.out.println(p1.toString());
//		System.out.println(players);
//		System.out.println(p1.hashCode()); // gives you memory address
//
//		System.out.println(p1 == p2);
//
//		System.out.println(p1.equals(p2));
	}
}

//toString()
//hashcode() 
//Object ---> toString()
class Player {
	String name;
	int score;

	public Player(String n, int s) {
		name = n;
		score = s;
	}

//	public String toString() {
//		return name + ":" + score;
//	}

	public int hashCode() {
		System.out.println("hasCode() => " + this.name);
		return super.hashCode();
	}

	public boolean equals(Object o) {
		System.out.println("equals() => " + this.name);
		return false;
	}

}
