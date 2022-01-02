package threadd;

public class ThreadDemo {

	public static void main(String[] args) {

		CopyThread cp = new CopyThread();
//		cp.run(); //traditional --> wrong 

		PrintThread pt = new PrintThread();

		cp.start();//
		
		try {
			cp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// stack merge 
		pt.start();
	}
}

class CopyThread extends Thread {
	// override
	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println("copy => " + i);
		}
	}

}

class PrintThread extends Thread {
	public void run() {

//		try {
//			sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}//2 second 
		
		
		for (int i = 1; i <= 15; i++) {
			System.out.println("print => " + i);
		}
	}

}
//30 second 
//15 seconds
