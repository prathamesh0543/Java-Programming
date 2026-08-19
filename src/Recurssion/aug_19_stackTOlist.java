package Recurssion;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class aug_19_stackTOlist {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		st.push(66);
		st.push(56);
		st.push(96);
		st.push(86);
		st.push(67);
		
		ArrayList<Integer> list=new ArrayList<>(st);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);

		

	}

}
