package collection;

import java.util.PriorityQueue;

public class jul_30_2methods_queue {

	//methods of queue
	public static void main(String[] args) {
		
		PriorityQueue p1 = new PriorityQueue<String>();
		p1.add(2);
		p1.add(4);
		p1.add(5);
		p1.add(6);
		System.out.println(p1);
		System.out.println(p1.size());
		p1.clear();
		System.out.println(p1.isEmpty());
		p1.remove(4);
		System.out.println(p1.contains(4));

	}

}
