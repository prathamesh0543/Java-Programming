package collection;

import java.util.PriorityQueue;

public class jul_30_9remove_poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue p1 = new PriorityQueue<String>();
		p1.offer(2);
		p1.offer(4);
		p1.offer(5);
		p1.offer(6);
		System.out.println(p1);
		p1.clear();
		//returns null if queue is empty
		System.out.println(p1.poll());
		System.out.println(p1);
		//returns exception if queue is empty
		p1.remove();
		System.out.println(p1);
	}

}
