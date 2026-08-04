import java.util.Scanner;

public class palindrome_26june {

	public static void main(String[] args) {
		
				// PALINDROME OR NOT PALINDROME
				
		 Scanner sc = new Scanner(System.in);

		 
				System.out.println("Enter your num");
				int n=sc.nextInt();
				 int original=n;
				 int rev=0;
				 
				 while(n>0) {
					 int rem=n%10;
					 rev=rev*10+rem;
					 n=n/10;
				 }if(original==rev) {
					 System.out.println("palindrome number");
				 }else {
					 System.out.println("not palindrome number");
				 }
				 
			}

		}


