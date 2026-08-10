package collection;

import java.util.HashMap;

public class Aug_10_1_map {

	public static void main(String[] args) {
		HashMap<Integer,String> p1=new HashMap<Integer,String>();
		
		p1.put(1, "abv");
		p1.put(6,"om");
		p1.put(11, "prathamesh");
		p1.put(3, "rohan");
		p1.put(9, "tushar");
		
		System.out.println(p1);
		System.out.println(p1.get(3));
		System.out.println(p1.containsKey(1));
		System.out.println(p1.containsValue("prathamesh"));
		p1.putIfAbsent(34, "ac");
		System.out.println(p1);
		p1.remove(34);
		System.out.println(p1);
		System.out.println(p1.keySet());
		System.out.println(p1.values());
		


	}

}
