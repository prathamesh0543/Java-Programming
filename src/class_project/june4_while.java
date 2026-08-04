package class_project;

public class june4_while {

	public static void main(String[] args) {

		//Sum of digit
		int n=1234321;
		int sum=0;
		while(n>0) {
			sum=sum + n%10;
			n=n/10;
		}
		System.out.println("sum of this numbers 1234321 is: "+sum);






		//		int p=1;
		//		while(p<=10) {
		//			System.out.println(p);
		//			p++;
		//		}
		//		System.out.println("---------------------------");
		//
		//		int q=10;
		//		while(q>=1) {
		//
		//			System.out.println(q);
		//			q--;
		//		}
		//		System.out.println("----------------------------");
		//
		//
		//		int a=1;
		//		while(a<=10) {
		//			System.out.println("hello");
		//			a++;
		//		}
		//		System.out.println("-----------------------------");
		//
		//		int b=5;
		//		int fact=1;
		//		int c=1;
		//		while(c<=b) {
		//			fact=fact*c;
		//
		//
		//			c++;
		//		}
		//		System.out.println("factorial:"+fact);
		//
		//		System.out.println("---------------");
		//
		//		int r=1;
		//		int sum=0;
		//		while(r<=15) {
		//			sum=sum+r;
		//
		//			r++;
		//		}
		//		System.out.println(sum+":  sum");
		//
		//
		//
		//		System.out.println("------------------------");
		//
		//		int n=34567;
		//
		//		while(n>0)//34567>0 t, 3456>0 t, 345>0 t, 34>0 t, 3>0 t 0>0 f
		//		{
		//			System.out.println(n%10);
		//			n=n/10;//    34567%10 =7
		//			       //    3456%10 = 6
		//		}          //    345%10 = 5
		//    34%10 =4
	}	           //  3%10= 3

}


