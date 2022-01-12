package threadd;

public class ThreadMethods {

	public static void main(String[] args) {
		Amazon ram = new Amazon();
//		Amazon shyam = new Amazon();
//		ram.setName("ram");
//		shyam.setName("shyam");
//		ram.start();
//		shyam.start();

		Thread t1 = new Thread(ram, "Ram");
		Thread t2 = new Thread(ram, "Ram - Wife");
		Thread t3 = new Thread(ram);
		Thread t4 = new Thread(ram, "Ram - son ");

		t3.setName("Ram - Daughter");

//		t1.setPriority(5);// ram
		t1.setPriority(Thread.NORM_PRIORITY);// default
		t2.setPriority(10);// wife
//		t3.setPriority(1);// daughter
		t3.setPriority(Thread.MIN_PRIORITY);
		// 1=>MIN
		// 10=>MAX

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("balance => " + ram.amazonPayBalance);

	}
}

class Amazon extends Thread {

	int amazonPayBalance = 20000;

	public void run() {

		buy(10000);
	}

	// common -- share --> resource
	// synchronized void buy(int amount)
	void buy(int amount) {
		///
		//
		//
		//
		synchronized (this) {
			//
			//

			//
			System.out.println("Transaction started For ==> " + currentThread().getName());
			if (amazonPayBalance - amount >= 0) {
				amazonPayBalance = amazonPayBalance - amount;
				System.out.println(currentThread().getName() + " ==> order placed....");
			} else {
				System.out.println("Sorry No Balance :: " + currentThread().getName());
			}

			System.out.println(" END == > " + currentThread().getName());
			//
		}
	}
}
