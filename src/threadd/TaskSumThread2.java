package threadd;

public class TaskSumThread2 {

	public static void main(String[] args) throws InterruptedException {
		SumThreadT st = new SumThreadT();

		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		Thread t3 = new Thread(st);

		synchronized (st) {

			st.begin = 1;
			st.end = 20;
			t1.start();
			st.wait();

			st.begin = 21;
			st.end = 40;
			t2.start();
			st.wait();

			st.begin = 41;
			st.end = 60;
			t3.start();
			st.wait();
		}
		System.out.println(st.total);
	}
}

class SumThreadT extends Thread {
	int total = 0;
	int begin, end;

	@Override
	public void run() {
		sum();
		// System.out.println("incremented counter = "+counter);
	}

	synchronized void sum() {

		System.out.println(begin + "==" + end);
		for (int i = begin; i <= end; i++) {
			total = total + i;
		}
		notify();
		//
//		counter=counter+20;
//		System.out.println(counter);
	}

}

//create class SumThread having total variable with 0 value. 
//we need to perform sum of 60 numbers. 
//1+2+3+...60 in total variable 
//but we need to divide this task in multiple thread. 
//like 1 thread will perform addition of 1  to 20 
//second thread will perform addition of 21 to 40 
//and third thread will perform addition of 41 to 60 
//after this print the total variable. 
