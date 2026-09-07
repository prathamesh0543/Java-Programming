package home_work_practice;

public class sep_7_largest {
	public static void main(String[] args) {
		
		int num=58398;
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
