package collection;

import java.util.PriorityQueue;

public class jul_31_5fact {

	public static void main(String[] args) {

		int num=5;
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();

		for(int i=1;i<=num;i++)
		{
			p1.add(i);
		}
		System.out.println(p1);
		int fact=1;
		for(Integer c:p1)
		{
			fact=fact*c;
		}
		System.out.println(fact);
	}

}
