package home_work_practice;

public class aug_30 {

	public static void main(String[] args) {

		int num=58321;
		int largest=0;
		
		while(num>0)
		{
			int digit=num%10;
			if(digit>largest)
			{
				largest=digit;
			}
			num=num/10;
		}
		System.out.println(largest);

	}

}
