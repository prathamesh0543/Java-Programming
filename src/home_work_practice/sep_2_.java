package home_work_practice;

public class sep_2_ {
	
	public static void main(String[] args) {
		
		int num=58321;
		int rev=0;
		
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reverse num is : "+rev);
	
}
}
