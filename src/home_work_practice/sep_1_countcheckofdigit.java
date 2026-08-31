package home_work_practice;

public class sep_1_countcheckofdigit {

	public static void main(String[] args) {
		int num=58321;
		int c=0;
		
		while(num>0)
		{
			int digit=num%10;
			c++;
			num=num/10;
		}
		System.out.println(c);


	}

}
