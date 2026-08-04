package collection;

import java.util.PriorityQueue;

public class jul_30_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue p1 = new PriorityQueue<String>();
		p1.offer(2);
		p1.offer(4);
		p1.offer(5);
		p1.offer(6);
		System.out.println(p1);
		int n=p1.size();
		for(int i=1;i<=n;i++)
		{
			System.out.println(p1.poll());
		}
	}

}
