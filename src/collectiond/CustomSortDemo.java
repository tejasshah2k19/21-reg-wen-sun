package collectiond;

import java.util.HashSet;
import java.util.TreeSet;

public class CustomSortDemo {

	public static void main(String[] args) {

		Book b1 = new Book(1, "C", 250);
		Book b2 = new Book(2, "C++", 350);
		Book b3 = new Book(3, "Java", 450);
		Book b4 = new Book(4, "J2EE", 550);// hashcode
//		Book b5 = new Book(4, "J2EE", 550);// hashcode

		// ArrayList
		// HashSet<Book> hs = new HashSet<>();
		TreeSet<Book> hs = new TreeSet<>();
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
//		hs.add(b5);

		System.out.println(hs);

	}
}

//map --> key:value 
class Book implements Comparable<Book> {

	int bookId;
	String title;
	int price;

	public Book(int bookId, String title, int price) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}

	public String toString() {
		return title + " : " + price;
	}

	// TreeSet -> b1.compareTo(b2)
	public int compareTo(Book o) {
		// -1-> 1st object is smaller
		// 1 1st object is greater
		// 0 1st and 2nd both are same

		if (this.price > o.price) {
			return -1;
		} else if (this.price < o.price) {
			return 1;
		} else {
			return 0;
		}

	}
}
