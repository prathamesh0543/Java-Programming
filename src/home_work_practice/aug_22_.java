package home_work_practice;

public class aug_22_ {

	public static void main(String[] args) {
		int c=0;
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				c++;
				sum=sum+i;
			}
		}
		System.out.println(c);
		System.out.println(sum);
	}

}
