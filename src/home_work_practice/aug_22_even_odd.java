package home_work_practice;

public class aug_22_even_odd {

	public static void main(String[] args) {

		int ec=0;
		int oc=0;

		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}
		}
		System.out.println("even "+ec);
		System.out.println("odd "+oc);


	}

}
