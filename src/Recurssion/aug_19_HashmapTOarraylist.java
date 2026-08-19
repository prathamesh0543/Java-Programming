package Recurssion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class aug_19_HashmapTOarraylist {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "pc");
		map.put(102, "rc");
		map.put(103, "tc");
		 
		ArrayList<Integer> a =new ArrayList<>(map.keySet());
	ArrayList<String> b=new ArrayList<>(map.values());
	System.out.println(a + " "+b);
	}
}
