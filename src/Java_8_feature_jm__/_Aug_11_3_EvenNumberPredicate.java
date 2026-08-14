package Java_8_feature_jm__;

import java.util.function.Predicate;

public class _Aug_11_3_EvenNumberPredicate {
	public static void main(String[] args) {
		
		
		Predicate<Integer>even=n->n%2==0;
		
		System.out.println(even.test(55));
	}

}
