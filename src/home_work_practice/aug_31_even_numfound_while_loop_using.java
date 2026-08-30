package home_work_practice;

public class aug_31_even_numfound_while_loop_using {

	public static void main(String[] args) {

		int num=58321;
		int c=0;
		
		while(num>0)
		{
			int digit=num%10;
			if(digit%2==0)
			{
				c++;
//				System.out.println(digit);
			}
			num=num/10;
		}
		System.out.println(c);

	}

}
