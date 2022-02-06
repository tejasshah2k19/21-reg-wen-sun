package innerclassd;

public class AnnoInnerClassDemo {

	public static void main(String[] args) {

		Counter c = new Counter();
		c.start();

		// annoy inner class
		Runnable r = new Runnable() {

			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
				}
			}
		};

		Thread t = new Thread(r) {
		};
		t.start();

		// Counter
		Thread tt = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
				}
			}
		};

		tt.start();

		Thread tx = new Thread(new Runnable() {
			public void run() {
				// TODO Auto-generated method stub

			}
		});

	}
}

class Counter extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}
