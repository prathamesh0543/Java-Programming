package home_work_practice;

public class aug_31_odd_numFound_ {

	public static void main(String[] args) {
		int num=58321;
		int c=0;
		
		while(num>0)
		{
			int digit=num%10;
			if(digit%2!=0)
			{
				c++;
				
			}
			num=num/10;
		}
		System.out.println(c);

	}

}
