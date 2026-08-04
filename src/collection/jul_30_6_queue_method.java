package collection;

import java.util.PriorityQueue;

public class jul_30_6_queue_method {
	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue<String>();
		p1.add(2);
		p1.add(4);
		p1.add(5);
		p1.add(6);
		System.out.println(p1);
		//peek -> front
		//returns top of the queue /front of queue
		
		System.out.println(p1.peek());
		//poll()-returns top and remove from queue
		
		System.out.println(p1.poll());
		System.out.println(p1);
		p1.poll();
		System.out.println(p1.poll());
	}

}
