package collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class Aug_12_1_HashTable {

	public static void main(String[] args) {
		
		
//		legacy class
//		hetro
//		no order
//		no duplicate allowed
//		no null key and null 
//		sync
//		Thread - safe
		
		Hashtable<Integer,String> p1=new Hashtable<Integer,String>();

		
		p1.put(1, "ab");
		p1.put(7,"bha");
		p1.put(6, "pc_0543");
		System.out.println(p1);
		
		System.out.println(p1.keySet());
		Enumeration<Integer> e1=p1.keys();
		while(e1.hasMoreElements())//hasnext
		{
			System.out.println(e1.nextElement());//next
			
		}
		
		System.out.println("---------------------------------");
		
		
		
		
		
		
		System.out.println(p1.values());
		Enumeration<String> e2=p1.elements();
		while(e2.hasMoreElements())//hasnext
		{
			System.out.println(e2.nextElement());//next
			
		}
		
		System.out.println("---------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(p1.get(1));
		p1.remove(1);
		System.out.println(p1);
		System.out.println(p1.containsKey(1)+" "+p1.containsValue("abcd"));
		System.out.println(p1.keySet());
		System.out.println(p1.values());
		p1.putIfAbsent(1, "lmno");
		
		System.out.println(p1);
		p1.clear();
		System.out.println(p1.isEmpty());
		System.out.println(p1);

	}

}
