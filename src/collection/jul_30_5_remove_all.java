package collection;

import java.util.PriorityQueue;

public class jul_30_5_remove_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue p1 = new PriorityQueue<String>();
		p1.add(2);
		p1.add(4);
		p1.add(5);
		p1.add(6);
		System.out.println(p1);
		PriorityQueue<Integer> p2= new PriorityQueue<Integer>();
		p2.add(2);
		p2.add(4);
		p2.add(5);
		p2.add(6);
		System.out.println(p2);
		p1.removeAll(p2);
		System.out.println(p1);
	}

}
