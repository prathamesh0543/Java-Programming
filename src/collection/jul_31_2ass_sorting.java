package collection;

import java.util.PriorityQueue;

public class jul_31_2ass_sorting {

	public static void main(String[] args) {
		//sorting using Priority Queue class
		

		int a[]= {1,3,5,2,3,58};
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();

		for(int i=0;i<a.length;i++)
		{
			p1.add(a[i]);
		}
		System.out.println(p1);
		while(!p1.isEmpty())
		{
			System.out.println(p1.poll());
		}
	}

}
