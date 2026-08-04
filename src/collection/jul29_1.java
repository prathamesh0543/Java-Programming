package collection;

import java.util.PriorityQueue;

public class jul29_1 {

	public static void main(String[] args) {
		
//		no order
//		homogeneous
//		no null is allowed
//		duplicate are allowed
		
		
		PriorityQueue p1=new PriorityQueue();
		p1.add(9);
		p1.add(8);
		p1.add(7);
		p1.add(6);
		p1.add(5);
		p1.add(4);
		p1.add(3);
		p1.add(2);
		p1.add(1);
		

		p1.remove(p1);
		System.out.println(p1);
		

	}

}
