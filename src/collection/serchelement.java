package collection;

import java.util.HashSet;

public class serchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 33, 22, 1 };
		int ele = 3;
		HashSet<Integer> h = new HashSet<>();

		for (Integer a1 : a) {

			h.add(a1);

		}
		int c=0;

		for (Integer s : h) {

			if (s == ele) {

				System.out.println("Found");
c++;
			}

		}
		if(c==0) {
			System.out.println("not found");
		}

	}

}
