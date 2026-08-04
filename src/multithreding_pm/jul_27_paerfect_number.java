package multithreding_pm;

public class jul_27_paerfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1;num<=100;num++)
		{
			int sum=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0)
				{
					sum+=i;
					
				}
			}
			if (sum==num)
			{
				System.out.println("perfect no:"+num);
			}
		}

	}

}
