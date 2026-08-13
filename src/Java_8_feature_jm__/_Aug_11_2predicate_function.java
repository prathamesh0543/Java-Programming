package Java_8_feature_jm__;

import java.util.function.Predicate;

public class _Aug_11_2predicate_function {

	public static void main(String[] args) {
		Predicate<Integer> age=(a)->a>=18;
		
		boolean result2=age.test(12);
		if(result2)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}

	
//	System.out.println("\n"+"\n"+"--------------------------------"+"\n"+"\n");
	//FIND GRATER AMONG NOS
	
	
	}

}
