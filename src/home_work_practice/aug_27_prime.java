package home_work_practice;

public class aug_27_prime {

	public static void main(String[] args) {
		int num=5;
		int c=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				c++;
		}
		if(c==2)
		{
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}

}
