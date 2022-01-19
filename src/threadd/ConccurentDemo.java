package threadd;

public class ConccurentDemo {

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().availableProcessors());// 8
		//1) single worker [1] SingleThreadPool 
		//2) fixed count [5] - FixedThreadPool 
		//3) dynamic count  - CachedThreadPool(2) 
		//4) schedule 
		
		//500 execute [ 1 -> 1 minute ] 
		//fix -> 5 -> 100min [ 5 java -worker -->  4 task ] 1 free  
		// dynamic ->
		
	}
}



