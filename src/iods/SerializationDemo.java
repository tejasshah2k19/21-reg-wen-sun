package iods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Bank b1 = new Bank();
//		Bank b2 = new Bank();
//		Bank b3 = new Bank();
		b1.openAccount();// 5 --> write(b1)
		// b2.openAccount();// 5
		// b3.openAccount();// 5
		// 15 writes
		// ATM
		File f = new File("d:\\Temp\\mydata.txt");
		f.createNewFile();
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b1);
		oos.close();

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Bank b = (Bank) ois.readObject();
		b.dispay();

		System.out.println("done..");
	}
}

//marker 
class Bank implements Serializable {
	int accountNumber;
	String name;
	String email, password;
	float balance;

	//
	void openAccount() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Name");
		name = scr.next();
		System.out.println("Enter email password ");
		email = scr.next();
		password = scr.next();
		accountNumber = (int) (Math.random() * 100000);
		System.out.println(accountNumber);
		balance = 50000;
	}

	void dispay() {
		System.out.println(accountNumber);
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(balance);
	}
}
