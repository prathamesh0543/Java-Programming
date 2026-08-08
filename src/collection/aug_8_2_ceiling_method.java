package collection;

import java.util.TreeSet;

public class aug_8_2_ceiling_method {

	public static void main(String[] args) {
		
		TreeSet<Integer> p1= new TreeSet<Integer> ();

		 p1.add(12);
		 p1.add(1);
		 p1.add(44);
		 System.out.println(p1);
		//Navigation set -Interface
		 //ceilling :it returns the nearby greater than equal to object to the given object
		 //if isnot present then i
		 
		 System.out.println(p1.ceiling(10));
		 System.out.println(p1.ceiling(3));

	}

}
