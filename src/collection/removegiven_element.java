package collection;

import java.util.HashSet;

public class removegiven_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3,4,5,6,5,7,8,8};
		int elem = 3;
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		for(int a1: a)
		{
			h.add(a1);
		}
		
		System.out.println(h);
		
		int c = 0;
		if(h.contains(elem))
		{
			h.remove(elem);
			c++;
		}
		
		System.out.println(h);
		if(c== 0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element removed");
		}
	}

}
