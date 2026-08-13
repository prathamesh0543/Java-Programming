package Java_8_feature_jm__;

import java.util.function.Consumer;
import java.util.function.Supplier;


public class _Aug_11_4_Consumer {

	public static void main(String[] args) {
		
		System.out.println("----------------supplier-----------------");
		
		Supplier<Double>random=()->Math.random();
		System.out.println(random.get());
		
		
		
		System.out.println("--------------consumer-------------------");
		
		Consumer<Integer > sq=(n)->System.out.println(n*n);
		sq.accept(3);

	}

}
