package home_work_practice;

public class aug_26_armstrong {

	public static void main(String[] args) {
		
		int num=153;
		int original=num;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			 sum=sum+digit*digit*digit;
			 num=num/10;
		}
		if(original==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}

	}

}
