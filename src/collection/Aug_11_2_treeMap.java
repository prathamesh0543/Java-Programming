package collection;

import java.util.TreeMap;

public class Aug_11_2_treeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> p1=new TreeMap<Integer,String>();
		p1.put(2, "ab");
		p1.put(3, "cj");
		p1.put(8, "nb");
		p1.put(6, "am");
		System.out.println(p1);
		System.out.println(p1.get(2));
		System.out.println(p1.containsKey(3));
		System.out.println(p1.containsValue("an"));
		p1.remove(2);
		System.out.println(p1);
		System.out.println(p1.keySet());
		System.out.println(p1.values());
		p1.putIfAbsent(9, "Hello everyone");
		System.out.println(p1);

		
		System.out.println(p1.firstKey());
		System.out.println(p1.lastKey());
		System.out.println(p1.ceilingKey(7));
		System.out.println(p1.floorKey(3));
	}

}
