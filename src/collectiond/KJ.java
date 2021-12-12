package collectiond;

import java.util.ArrayList;
import java.util.Scanner;

public class KJ {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int choice = -1;
		ArrayList<Product> products = new ArrayList<>();

		while (true) {
			System.out.println("1 For Add Product");
			System.out.println("2 For List Product");
			System.out.println("3 For Search Product");
			System.out.println("4 For EXit \nEnter Your choice..");
			choice = scr.nextInt();

			switch (choice) {
			case 1:
				Product p = new Product();
				p.getData();
				products.add(p);// list -> add -> p
				break;
			case 2:
				System.out.println("print all products");
				for (Product p1 : products) {
					p1.printData();
				}
				break;
			case 3:
				System.out.println("Enter product name for search product");
				break;
			case 4:
				System.exit(0);

			}

		}

	}
}

class Product {
	private String category;
	private String name;
	private int price, qty;
	private String buildType;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getBuildType() {
		return buildType;
	}

	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}

	public void printData() {
		System.out.println(category + " " + name + " " + qty + " " + price + " " + buildType);
	}

	public void getData() {

		Scanner scr = new Scanner(System.in);

		System.out.println("Enter Category : ");
		category = scr.next();
		System.out.println("Enter productName : ");
		name = scr.next();
		System.out.println("Enter price : ");
		price = scr.nextInt();
		System.out.println("Enter Qty : ");
		qty = scr.nextInt();
		System.out.println("Enter BuildType : ");
		buildType = scr.next();

	}

}
