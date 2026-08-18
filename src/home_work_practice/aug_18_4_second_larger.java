package home_work_practice;

public class aug_18_4_second_larger {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		int c=20;
		if(a>b&&a>c) {
			if(b>c)
			{
				System.out.println("b is second greater");
			}
			else
			{
				System.out.println("c is second greater");
			}
		}
		else if(b>a&&b>c){
			if(a>c)
			{
				System.out.println("a is second greater");
			}
			else
			{
				System.out.println("c is second grater");
			}
			
		}
		else
		{
			if(a>b) {
			System.out.println("a is second greater");
		}
		else {
			System.out.println("b is second greater");
		}
			
		}
			
	}

}
