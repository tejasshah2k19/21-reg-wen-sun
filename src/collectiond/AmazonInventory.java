package collectiond;

import java.util.HashSet;

public class AmazonInventory {

	public static void main(String[] args) {
		// ctrl+shift+f

		AProduct p1 = new AProduct("iphone13pro", 139000, 10, 13);
		AProduct p2 = new AProduct("iphone12pro", 129000, 10, 14);
		AProduct p3 = new AProduct("iphone13pro", 139000, 100, 13);

		AProduct p4 = new AProduct("mouse", 139000, 10, 19);
		AProduct p5 = new AProduct("laptop", 139000, 10, 15);
		AProduct p6 = new AProduct("tv", 139000, 10, 16);
		AProduct p7 = new AProduct("bottle", 139000, 10, 17);

		HashSet<AProduct> hs = new HashSet<>();// object --> unique --> hashcode

		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		hs.add(p6);
		hs.add(p7);

		System.out.println(hs);
		System.out.println(hs.size());
	}
}

class AProduct {
	String name;
	int price;
	int qty;
	int productId;

	public AProduct(String n, int p, int q, int pid) {
		this.name = n;
		price = p;
		qty = q;
		productId = pid;

	}

	public String toString() {
		return name + ":" + productId;
	}

	public int hashCode() {
		// same --> equals
		// notsame -->
		return 1;// same
	}

	@Override
	public boolean equals(Object obj) {
		AProduct tmp = (AProduct) obj;
		return this.productId == tmp.productId;
	}
}
