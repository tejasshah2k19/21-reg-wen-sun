package covax;

import java.util.Scanner;

public class CovaxApp {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		// new ()
		Citizen c[] = new Citizen[25]; // 25 object with no memory --> null
		int citizenCounter = 0;

		int a[] = new int[5];
		while (true) {
			System.out.println("\n" + "1 Enroll For Vaccination \n" + "2 Check Status Of Vaccination \n"
					+ "3 Issue Certificates \n" + "4 exit \n Enter Your Choice");
			int choice = scr.nextInt();
			switch (choice) {
			case 1:
				// new object
				if (citizenCounter == 24) {
					System.out.println("No Slots Available.....");
				} else {
					c[citizenCounter] = new Citizen();
					c[citizenCounter].getData();
					citizenCounter++;// 1 2 3 4 ---24
				}
				break;
			case 2:
				System.out.println("Enter your aadhar number : ");
				int aadhar = scr.nextInt();
				//c.vaccinationStatus(aadhar);
				break;
			case 3:
				System.out.println("Name       Gender  Age State      City       AadharNumber  Doze1    Doze2");
				for(int i=0;i<citizenCounter;i++) {
					c[i].printInfo();
				}
				break;
			case 4:
				System.exit(0);
			}
		}

	}
}

class Citizen {
	String name;
	int age;
	String state;
	String gender;
	String city;
	int aadharNumber;
	boolean dz1 = false, dz2; // boolean default -> false

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = scr.next();
		System.out.println("Enter Your Gender : ");
		gender = scr.next();
		System.out.println("Enter Your Age : ");
		age = scr.nextInt();
		System.out.println("Enter Your StateName : ");
		state = scr.next();
		System.out.println("Enter Your CityName : ");
		city = scr.next();
		System.out.println("Enter Your AadharNumber : ");
		aadharNumber = scr.nextInt();

		System.out.println("do you want to take your 1st doze? y or n");

		String choice = scr.next();

		if (choice.equalsIgnoreCase("y")) {
			dz1 = true;
		}

	}

	void vaccinationStatus(int aadhar) {

		if (aadharNumber == aadhar) {
			System.out.println(name + "'s Vaccination Details");
			System.out.println("1st Doze : " + (dz1 == true ? "Taken" : "Pending"));
			System.out.println("2nd Doze : " + (dz2 == true ? "Taken" : "Pending"));
		} else {
			System.out.println("Invalid Aadhar number");
		}
	}

	
	void printInfo() {
		System.out.printf("%-10s %-7s %-3d %-10s %-10s %-13d %-8s %-8s\n",name,gender,age,state,city,aadharNumber,(dz1 == true ? "Taken" : "Pending"),(dz2 == true ? "Taken" : "Pending"));
	}
}
