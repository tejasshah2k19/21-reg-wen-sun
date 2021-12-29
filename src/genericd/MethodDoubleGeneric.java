package genericd;

import java.util.ArrayList;

//public class MethodDoubleGeneric {

//	public static void main(String[] args) {
//		PrintInfo pinfo = new PrintInfo();
//		Dog d = new Dog();
//		Cat c = new Cat();
//		Cow cw = new Cow();
//		pinfo.printInformation(d);
//		pinfo.printInformation(c);
//		pinfo.printInformation(cw);
//	}
//}
//class PrintInfo {
//
//	void printInformation(Animal a) {
//		a.print();
//	}
//}
//class Animal {
//	void print() {
//		System.out.println("Animal");
//	}
//}
//class Dog extends Animal {
//	void print() {
//		System.out.println("Animal - Dog");
//	}
//}
//class Cat extends Animal {
//	void print() {
//		System.out.println("Animal - Cat");
//	}
//}
//class Cow extends Animal {
//	void print() {
//		System.out.println("Animal - Cow");
//	}
//}

//public class MethodDoubleGeneric {
//	public static void main(String[] args) {
//		PrintInfo pinfo = new PrintInfo();
//		Dog d[] = new Dog[3];
//		d[0] = new Dog();
//		Cat c[] = new Cat[3];
//		c[0] = new Cat();
//		Cow cw[] = new Cow[3];
//		cw[0] = new Cow();
//		
//		
//		pinfo.printInformation(d);
//		pinfo.printInformation(c);
//		pinfo.printInformation(cw);
//	}
//}
//
//class PrintInfo {
//
//	void printInformation(Animal a[]) {
//		a[0].print();
//	}
//}
//
//class Animal {
//	void print() {
//		System.out.println("Animal");
//	}
//}
//
//class Dog extends Animal {
//	void print() {
//		System.out.println("Animal - Dog");
//	}
//}
//
//class Cat extends Animal {
//	void print() {
//		System.out.println("Animal - Cat");
//	}
//}
//
//class Cow extends Animal {
//	void print() {
//		System.out.println("Animal - Cow");
//	}
//}

public class MethodDoubleGeneric {
	public static void main(String[] args) {
		PrintInfo pinfo = new PrintInfo();

		ArrayList<Animal> animal = new ArrayList<>();
		animal.add(new Dog());// instanceof

		ArrayList<Dog> dog = new ArrayList<>();
		ArrayList<Cat> cat = new ArrayList<>();
		ArrayList<Cow> cow = new ArrayList<>();

		ArrayList<String> str = new ArrayList<>();
		pinfo.printInformation(animal);
		pinfo.printInformation(cat);
		pinfo.printInformation(cow);
//		pinfo.printInformation(str);

	}
}

class PrintInfo {

	void printInformation(ArrayList<? extends Animal> list) {
		// we can also use super instead of extends in method arg ?
	}
}

class Animal {
	void print() {
		System.out.println("Animal");
	}
}

class Dog extends Animal {
	void print() {
		System.out.println("Animal - Dog");
	}
}

class Cat extends Animal {
	void print() {
		System.out.println("Animal - Cat");
	}
}

class Cow extends Animal {
	void print() {
		System.out.println("Animal - Cow");
	}
}