package collection;

import java.util.TreeSet;

public class Aug_8_1treeset {

	public static void main(String[] args) {
		 TreeSet<Integer> p1= new TreeSet<Integer> ();

		 p1.add(12);
		 p1.add(1);
		 p1.add(44);
		 System.out.println(p1);
		 System.out.println(p1.pollFirst());
		 System.out.println(p1.pollLast());
		 System.out.println(p1.first());
		 
	}

}
