package OOPs;
import java.util.Scanner;

class bank1
{
	void withdrawl(double amount){
		
		System.out.println("Enter amount to withrawal: ");
		double withr;
		amount=amount-withr;
		System.out.println("Amount after withrawl: "+amount);
		if(withr<=amount) {
			amount = amount-withr;
			System.out.println("Amount after withrawl: "+amount);
		}
		else {
			System.out.println("");
		}
		
	}
	
	void deposite(double amount) {
		System.out.println("Enter amount to deposite: ");
		double dep;
		amount=amount+dep;
		System.out.println("Amount after deposite: "+amount);
		
	}
}
class bank extends bank1
{
	void withdrawl(double amount) {
		super.withdrawl(amount);
	}
	void deposite(double amount) {
		super.deposite(amount);
		
	}
}



public class mix_all_pm {

	public static void main(String[] args) {
		
		
	bank1 b=new bank1();
		Scanner sc= new Scanner(System.in);
		int amount=1000;
		
		
		System.out.println("index\n 1. Withraw \n 2.deposite");
		
		System.out.println("Enter your choice: ");
		int ch=sc.nextInt();
		
		
		switch(ch){
		
		case 1:
			b.withdrawl(amount);
			break;
		case 2:
			b.deposite(amount);break;
			
			default: 
				System.out.println("not");
	}

}
}
