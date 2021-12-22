package collectiond;

public class ToStringHashCodeEquals {

	public static void main(String[] args) {
//
//		Employee e = new Employee();
//		e.age = 24;
//		e.name = "ravan";
//
//		System.out.println(e.age);// 24
//
//		System.out.println(e.toString()); // object --> print
//		// implicitly --> e.toString();
//		System.out.println(e.hashCode());
//		System.out.println(e);
//		// package.class@hashcode() --> hexadecimal value
//		// 366712642
//		// 15db9742
//	
//		System.out.println(e.hashCode());

		Employee e = new Employee();
		e.age = 24;
		e.name = "ravan";

		Employee t = new Employee();
		t.age = 24;
		t.name = "ravan";

		System.out.println(e == t);// false memory address
		System.out.println(e.equals(t));// false ==

		Employee tt = t; // memory same
		System.out.println(t == tt);// true
		System.out.println(t.equals(tt));// true
	}

}

//Object --> class ->Parent Of aLL class [ directly -in ] 
class Employee {

	String name;
	int age;

	public String toString() {
		return name;
	}

	public int hashCode() {
		return 1;
	}

	public boolean equals(Object roman) {
		Employee t = (Employee) roman;
		return this.name.equals(t.name);
	}
}
