package class_project;

public class june_8_while {

	public static void main(String[] args) {
		
		int num=500;
		int temp=num;
		int sum=0;
		while(num>0) {
			System.out.println(num%10);
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum ="+sum);
		if(temp%sum==0)
			
		{
			System.out.println("harshad no");
		}
		else
		{
			System.out.println("not harshad no");
		}
		
		
//		int num=12345678;
//		int c=0;
//		while(num>0) {
////			System.out.println(num%10);
//			c++;
//			num=num/10;
//			
//		}
//		System.out.println("count :"+c);
		
		
		
		
// 		int num=12345678;
//		int  rem;
//		while(num>0) {
//			rem=num%10;
//			num=num/10;
//			if(rem%2==0) {
//				System.out.println(rem);
//			}
//		}
	}

}
