package class_project;

import java.util.Scanner;

public class june_10 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num  =sc.nextInt();
		
		int num1=num ;
		int temp=num;
		int c=0;
		
		
		//armstrong number
		
		int rem=0;
		int result=0;
		while(num>0) {
			c++;
			num=num/10;

		}
		while(num1>0) {
			rem=num1%10;
			num1=num1/10;
			result+= Math.pow(rem, c);
			
		}
		System.out.println(result);
		if(temp==result) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not");
		}
		
		
		
		
		
//		int num=252;
//		int temp=num;
//		int rev=0;
//		int rem=0;
//
//		while(num>0) {//252>0t 25>0t 2>0t 0>0
//
//			rem=num%10;//252%10=2 25%10=5 2%10=2
//			rev=rev*10+rem;//0*10+2=2 2*10+5=25 25*10+2=252
//			num=num/10;//252/10=25 25/10=2 2/10=2 
//		}
//		System.out.println(rev);
//		if(temp==rev) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("NOT ");
//		}

	}

}


