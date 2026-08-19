package Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class aug_19_HashsetTOArraylist {

	public static void main(String[] args) {


		HashSet<Integer>Set=new HashSet<>(Arrays.asList(20,30,10,40));
		 
		 ArrayList<Integer> list = new ArrayList<>(Set);

		 Collections.sort(list);
		 System.out.println(list);
	}

}
