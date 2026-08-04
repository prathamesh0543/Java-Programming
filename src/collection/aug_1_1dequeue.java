package collection;
import java.util.*;

public class aug_1_1dequeue {

	public static void main(String[] args) {
		
		ArrayDeque p=new ArrayDeque();
		p.add(4);
		p.add(3);
		p.add("abs");
		p.add(12.4);
;
		System.out.println(p);
		
//		p.addFirst(100);
//		p.addLast(2000);
//		p.offerFirst(200);
//		p.offerLast(900);
//		System.out.println(p);
		
//		System.out.println(p.peekFirst()+""+p.peekLast());
//		System.out.println(p.pollFirst()+""+p.pollLast());
//		System.out.println(p);
		
		System.out.println();
		System.out.println(p.getFirst());
		System.out.println(p.getLast());
		

	}

}
