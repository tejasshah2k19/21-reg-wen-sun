package collectiond;

import java.util.ArrayList;
import java.util.Scanner;

public class KJ {

	public static void main(String[] args) {

		Scanner scr1 = new Scanner(System.in);
		int choice = -1;
		ArrayList<Product> products = new ArrayList<>();
		ArrayList<User> users = new ArrayList<>();
		User admin1 = new User();
		admin1.setFirstName("ram");
		admin1.setEmail("ram@gmail.com");
		admin1.setPassword("ram");
		admin1.setRole("a");

		users.add(admin1);

		while (true) {
			System.out.println("1 Login\n2 Signup\n3 Exit\nEnter choice");
			choice = scr1.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Login");
				System.out.println("Enter email and password");
				String em = scr1.next();
				String pwd = scr1.next();
				boolean isCorrectUser = false;
				User currentUser = null;
				for (User uu : users) {
					if (uu.getEmail().equalsIgnoreCase(em) && uu.getPassword().equals(pwd)) {
						isCorrectUser = true;
						currentUser = uu;
						break;
					}
				}

				if (isCorrectUser == true) {
					// load menu ---> customer | admin
					if (currentUser.getRole().equals("a")) {
						adminmenu: while (true) {
							System.out.println("1 For Add Product");
							System.out.println("2 For List Product");
							System.out.println("3 For Search Product");
							System.out.println("4 For Logout \nEnter Your choice..");
							choice = scr1.nextInt();

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
								break adminmenu;

							}// admin switch

						} // admin menu while

					} else if (currentUser.getRole().equals("c")) {
						usermenu: while (true) {
							System.out.println("1 For Buy Product");
							System.out.println("2 For List Product");
							System.out.println("3 For Search Product");
							System.out.println("4 For Logout \nEnter Your choice..");
							choice = scr1.nextInt();

							switch (choice) {
							case 1:
								System.out.println("Buy product");
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
								break usermenu;

							}// user switch

						} // user menu while

					} else {
						System.out.println("dont try to hack my app");
					} // main if
				} else {
					System.out.println("Invalid Credentials Try Again......");
				} // login if

				break;
			case 2:
				System.out.println("Signup");
				System.out.println("Enter firstName email and password");
				String fn = scr1.next();
				em = scr1.next();
				pwd = scr1.next();
				User u = new User();
				u.setFirstName(fn);
				u.setEmail(em);
				u.setPassword(pwd);
				u.setRole("c");
				users.add(u);

				break;
			case 3:
				System.exit(0);

			}

		}

	}
}

//Bean 
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

class User {

	private ArrayList<Product> orders = new ArrayList<>();
	private String role; // admin customer
	private String firstName, email, password;
	private int userId;

	User() {
		this.userId = (int) (Math.random() * 1000000);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
