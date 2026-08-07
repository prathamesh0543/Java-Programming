package collection;

import java.util.LinkedHashSet;

public class aug_7_2_clone_retainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();

		l1.add(93);
		l1.add(45);
		l1.add(18);

		System.out.println(l1);

		LinkedHashSet l2 = new LinkedHashSet();

//		l2 = (LinkedHashSet) l1.clone();

		l2.add(2);
		l2.add(35);
		l2.add(45);
		l2.add(18);
		System.out.println(l2);

		l2.retainAll(l1);
		System.out.println(l2);
	}

}



// hashset                     
//1).no order
//2).faster
//3). backround data structure is hashtable 
//4).backup:hashmap
//5).use when performance matter


// linked hashset                     
//1).insertion order
//2).slower
//3).backround data structure is hashtable and linkedlist
//4).backup: linkedhashmap
//5).use when oredr is matter
