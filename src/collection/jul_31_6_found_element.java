package collection;

import java.util.PriorityQueue;

public class jul_31_6_found_element {

	public static void main(String[] args) {
		
		//search given ele using priority queue

		int a[]= {1,2,3,4,5,6,7,8};
		int ele=3;
		 PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		
		  for(int i = 0; i < a.length; i++)
		    {
		        p1.add(a[i]);
		    }
		System.out.println(p1);
		for(Integer b:p1)
		{
			if(b==ele)System.out.println("found");;
//			else System.out.println("not fount");
		}
	}

}
