package collectiond;

import java.util.PriorityQueue;

public class PriorityQDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		
		pq.add(20);
		pq.add(20);
		pq.add(30);
		pq.add(25);
		pq.add(12);
		pq.add(200);
		pq.add(36);
		
		System.out.println(pq);

		//System.out.println(pq.peek());
		//System.out.println(pq.peek());
		
		System.out.println(pq);
		System.out.println(pq.poll()); // return smallest and remove it 
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	
		System.out.println(pq.size());

		System.out.println(pq.contains(20));
		
	
	
	}
}
