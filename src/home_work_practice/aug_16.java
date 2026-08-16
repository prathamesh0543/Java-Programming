package home_work_practice;

public class aug_16 {

	public static void main(String[] args) {		
		int num=12345;
		int reverse=0;
		System.out.println("The numbers is : "+num);
		
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
			
		}
		
		System.out.println("Reverse number is : "+reverse);
		

	}

}
