package collection;

import java.util.PriorityQueue;

public class jul_30_8element_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p1 = new PriorityQueue<String>();
		p1.offer(2);
		p1.offer(4);
		p1.offer(5);
		p1.offer(6);
		System.out.println(p1);
		p1.clear();
		//returns front of queue but if the queue is empty then it will returns null
		System.out.println(p1.peek());
		//returns front of queue but if the queue is empty then it will returns exception
		
		System.out.println(p1.element());

	}

}
