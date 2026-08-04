package collection;

import java.util.PriorityQueue;

public class jul_31_4sum_of_digit {

	public static void main(String[] args) {

		//sum of digit
		//234->9
		int num=234;
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		
		while(num>0)
		{
			int rem=num%10;
		    p1.add(rem);
		    num/=10;
		}
		System.out.println(p1);
		int sum=0;
		for(Integer c:p1)
		{
			sum+=c;
		}
		System.out.println("sum of digit :"+sum);
	}

}
