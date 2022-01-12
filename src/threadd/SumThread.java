package threadd;

public class SumThread {

	// p s v m (s []) -> jre 
	public  static void main(String[] args) throws InterruptedException {

		Sum s = new Sum();

		synchronized (s) {
			s.start();// thread 1
//		s.join(); //first  

//		s.sleep(1000);
//		Thread.sleep(1000);
			s.wait();
		}
		System.out.println("main => " + s.total);// total 1

		// 3
	}
}

class Sum extends Thread {
	int total = 0;

	public void run() {
		System.out.println("in side run");
		for (int i = 1; i <= 20; i++) {
			total++;
		}
		System.out.println("after run sum is " + total);
		notify();
	}

}

//sync  --> common resources --> threads 

//join