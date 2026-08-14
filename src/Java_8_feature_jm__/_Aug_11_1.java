package Java_8_feature_jm__;

import java.util.function.BiFunction;

public class _Aug_11_1 {

	public static void main(String[] args) {
		
		BiFunction<Float,Float,Float> sum=(x,y)->x+y;
//		Float result =sum.apply(7.0f, 45.0f);
		System.out.println("floating addition : "+sum.apply(7.0f, 45.0f));
		
		BiFunction<String,String,String> name = (a,b) -> a+b;
		
		System.out.println("Name : "+name.apply("Prathamesh ", "Chavan"));
		
		
		
		BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b; 
		System.out.println("Addition : "+add.apply(89, 21));

	}

}

