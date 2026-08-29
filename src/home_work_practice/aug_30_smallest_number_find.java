package home_work_practice;

public class aug_30_smallest_number_find {

	public static void main(String[] args) {

		int num=58321;
		int smallest=9;
		
		while(num>0)
		{
			int digit=num%10;
			if(digit<smallest)
			{
				smallest=digit;
			}
			num=num/10;
		}
		System.out.println(smallest);
	}

}
