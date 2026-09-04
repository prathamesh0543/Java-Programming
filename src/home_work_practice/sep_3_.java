package home_work_practice;

public class sep_3_ {

	public static void main(String[] args) {
		int num=121;
		int original=num;
		int reverse=0;
		
		while(num>0)
		{
			int digit =num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		if(original==reverse) 
		{
		System.out.println("palindrome");	
		}
		else
		{
			System.out.println("none");
		}

	}

}
