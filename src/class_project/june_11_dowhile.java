package class_project;
import java.util.Scanner;
public class june_11_dowhile {

	public static void main(String[] args) {
		
		
		int num;
		do {
			
		
		
		System.out.println("-----INDEX----- \n"
				+"\n1.even / odd"
				+"\n2.positive / negative"
				+"\n3.factorial"
				+"\n4.EXIT");
		
		System.out.println("Enter your choice :-");
		Scanner sc =new Scanner(System.in);
		 num=sc.nextInt();
		 
		 switch(num) {
		 
		 case 1:
			 
			 int a=6;
			 if(a%2==0) {
				 System.out.println("even");
				 
			 }else {
				 System.out.println("odd");
		
		 }
			 break;
			
				case 2:
				int s=4;
				if(s>0) {
					System.out.println("positive");
				}else if(s<0) {
					System.out.println("negative");
					
				}else {
					System.out.println("zero");
				}
					break;
					
				case 3:
					int b=5;
					int fact=1;
					for(int i=1;i<=b;i++) {
						fact=fact*i;
						
					}System.out.println("fact :"+
					fact);
	
					
					break;
					
				case 4:
					System.out.println("exit");
					break;
					
					default:
						System.out.println("invalid choice");
			}
		
		}while(num!=4);
			
		}
		
			
		
	}
		
	


