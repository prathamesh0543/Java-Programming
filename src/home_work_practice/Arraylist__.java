package home_work_practice;

import java.awt.List;
import java.util.ArrayList;

public class Arraylist__ {

	public static void main(String[] args) {
		
		ArrayList<Integer> p=new ArrayList<>();
		
		//ArrayList
		//null is allow
		//dulpicate are allow
		//no order
		
		p.add(2);
		p.add(2);
		p.add(null);
		p.add(7);
		p.add(4);
		
		System.out.println(p);
		System.out.println(p.get(2));
		System.out.println(p.contains(7));
		System.out.println(p.size());

	}

}
