package collection;

import java.util.HashSet;

public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3,4,5,6,5,7,8,8};
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int obj: a)
		{
			h.add(obj);
		}
		
		System.out.println(h);
		
		int max = Integer.MIN_VALUE;
		  int min = Integer.MAX_VALUE;
		
		for(int a1: h)
		{
			if(max < a1)
			{
				max = a1;
			}
			   if(a1 < min)
	            {
	                min = a1;
	            }
	        }
		
		
	 System.out.println("Maximum element: " + " " +max);
     System.out.println("Min element: " + " " +min);
	}

}
