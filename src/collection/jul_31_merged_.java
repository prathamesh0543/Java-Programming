package collection;

import java.util.PriorityQueue;

public class jul_31_merged_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> n1=new PriorityQueue<Integer>();
		PriorityQueue<Integer> n2=new PriorityQueue<Integer>();
		PriorityQueue<Integer> n3=new PriorityQueue<Integer>();


		
		n1.add(9);
		n1.add(8);
		n1.add(7);
		System.out.println("first PriorityQueue : "+n1);
		
		n2.add(6);
		n2.add(5);
		n2.add(4);
		System.out.println("Second PriorityQueue : "+n2);
		
		for(Integer a:n1)
		{
			n3.add(a);
		}
		for(Integer b:n2)
		{
			n3.add(b);
		}
		System.out.println(" MERGED :- "+n3);

	}

}
