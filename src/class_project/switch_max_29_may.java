package class_project;

import java.util.Scanner;

public class switch_max_29_may {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=20;
		int b=30;
		 
		int max=1;
		
		switch(max) {
		case 1:
			if(a>b) {
				System.out.println("a is greater");
			}	else {
			System.out.println("b is grater");		
				}break;
			default :
				System.out.println("invalid input");
			}
		}
	

}
