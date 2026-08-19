package Recurssion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class aug_19_ListrToset {

	public static void main(String[] args) {

		String arr[]= {"a","b","a","c","b"};
		List<String> list=Arrays.asList(arr);
		Set<String> set=new HashSet<>(list);

		System.out.println(set);

	}

}
