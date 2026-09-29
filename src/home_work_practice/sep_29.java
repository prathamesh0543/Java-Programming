package home_work_practice;

import java.util.Enumeration;
import java.util.Hashtable;

public class sep_29 {

	public static void main(String[] args) {

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
	}

}
