package home_work_practice;

public class sep_3_all_even_sum {

	public static void main(String[] args) {
		int num=58321;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			if(digit%2==0)
			{
				sum=sum+digit;	
			}
			num=num/10;
		}
		System.out.println(sum);


	}

}
