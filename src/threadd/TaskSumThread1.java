package threadd;

public class TaskSumThread1 {

	public static void main(String[] args) throws InterruptedException {

		SumThreadS s = new SumThreadS();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		Thread t4 = new Thread(s);
		Thread t5 = new Thread(s);

		synchronized (s) {
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
		s.wait();//main wait 
		}
		s.printTotal();
		//
	}
}

class SumThreadS extends Thread {

	int total = 0;

	synchronized void increment() {
		for (int i = 1; i <= 20; i++)
			total++;
		System.out.println(total);
//		if (total == 100)
//			notify();
	}

	@Override
	public void run() {
		increment();
	}
	//can we mark this method sync and release main ?
	void printTotal() {
		System.out.println("total => " + total);

	}
}

//create class SumThread having total variable with 0 value. 
//create 1 method increment which increase total variable by 20 [ total = total + 1] 
//create 1 method printtotal which print value of total variable. 
//
//your task is make 5 thread of an SumThread object and call increment 
//once all 5 increment finish print total
//
//your main object  will call   printtotal method 
