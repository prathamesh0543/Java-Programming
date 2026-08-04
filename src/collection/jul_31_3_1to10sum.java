package collection;

import java.util.PriorityQueue;

public class jul_31_3_1to10sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();

		for(int i=1;i<=num;i++)
		{
			p1.add(i);
		}
		System.out.println(p1);
		int sum=0;

		for(Integer a:p1)
		{
			sum=sum+a;
		}
		System.out.println(sum);

	}

}
