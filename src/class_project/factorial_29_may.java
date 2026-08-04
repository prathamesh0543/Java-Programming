package class_project;

public class factorial_29_may {

	public static void main(String[] args) {
		int num=24;
		int fact=1;

		if(num>0)
		{
			System.out.println("Positive");
			if(num%2==0) {
				System.out.println("Even");
				for(	int i=1;i<=num;i++) {

					fact=fact*i;
				}
				System.out.println("fact: "+fact);
			}else {
				System.out.println("odd");
			}
		}
		else if(num>0)
		{
			System.out.println("Negative");
		}
		else {
			System.out.println("zero");
		}



		//		int num=7;
		//		int fact=1;
		//		
		//		for (int i=1;i<=7;i++)//1<=7 t 2<=7t 3<=7 t 4<=7t 5<=7t 6<=7t 7<=7t 8<=7f
		//		{
		//			fact=fact*i;
		//		}
		//	System.out.println(fact);
		//	//1*1=1
		//	//1*2=2
		//	//2*3=6
		//	//6*4=24
		//	//24*5=120
		//	//120*6=720
		//	//720*7=5040
		//	
	}

}
