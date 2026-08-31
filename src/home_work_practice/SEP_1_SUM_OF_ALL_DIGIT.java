package home_work_practice;

public class SEP_1_SUM_OF_ALL_DIGIT {

	public static void main(String[] args) {

		int num=58321;
		int c=0;
		
		while(num>0)
		{
			int digit=num%10;
			c=c+digit;
			num=num/10;
		}
		System.out.println(c);


	}

}
