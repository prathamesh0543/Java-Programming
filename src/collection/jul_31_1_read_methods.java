package collection;

import java.util.PriorityQueue;

public class jul_31_1_read_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
    	p1.add(2);
		p1.add(4);
		p1.add(5);
		p1.add(6);
		System.out.println(p1);
		while(p1.size()>0) {
			System.out.println(p1.poll());
		}
		while(!p1.isEmpty())
		{
			System.out.println(p1.poll());
			
		}
		for(Integer a:p1)
		{
			System.out.println(a);
		}

	}

}
