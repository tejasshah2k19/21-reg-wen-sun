package threadd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConccurentDemo {

	public static void main(String[] args) {

		// System.out.println(Runtime.getRuntime().availableProcessors());// 8
		// 1) single worker [1] SingleThreadPool
		// 2) fixed count [5] - FixedThreadPool
		// 3) dynamic count - CachedThreadPool(2)
		// 4) schedule

		// 500 execute [ 1 -> 1 minute ]
		// fix -> 5 -> 100min [ 5 java -worker --> 4 task ] 1 free
		// dynamic ->

		// thread pool --> queue
		// add thread task

		// queue --> worker --> processing unit --> t1 t2 t3

		MyThread m = new MyThread();

		Thread t1 = new Thread(m, "t1");
		Thread t2 = new Thread(m, "t2");
		Thread t3 = new Thread(m, "t3");

//		t1.start();
//		t2.start();
//		t3.start();
//		ExecutorService ex = Executors.newSingleThreadExecutor();
//		ex.submit(t1);
//		ex.submit(t2);
//		ex.submit(t2);
		// queue --> t1 t2 t3
//
//		ExecutorService ex = Executors.newFixedThreadPool(3);//newSingle -- .start() // 9 
		ExecutorService ex = Executors.newCachedThreadPool();//1 2 3 4 5 6 7 8  
		ex.submit(t1); 
		ex.submit(t2);
		ex.submit(t2);
		ex.shutdown();// idle

//		   return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                   60L, TimeUnit.SECONDS,
//                   new SynchronousQueue<Runnable>()
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("i am running  == > " + currentThread().getName());
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run()" + currentThread().getName());

	}
}


