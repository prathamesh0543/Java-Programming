package class_project;

public class june2_pattern {

	public static void main(String[] args) {
//		//left angel triangle 
//		System.out.println("left angel triangle ");
//		for(int row=1;row<=7;row++) {
//		
//		for(int col=1;col<=row;col++) 
//		{
//			System.out.print("*");
//		}
//		System.out.println();
//	}

	//right angle
//		System.out.println("right angle triangle ");
//		for(int row=1;row<=5;row++) {
//			for(int s=4;s>=row;s--) {
//				System.out.print(" ");
//			}
//		for(int col=1;col<=row;col++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		
//		System.out.println("right angle inverted triangle "); 
//		for(int row=1;row<=5;row++) {
//			for(int s=1;s<=row;s++) {
//				System.out.print(" ");
//			}
//		for(int col=5;col>=row;col--) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//........................................
		
//		for(int row=1;row<=9;row++) {
//			if (row>=1 && row<=5) {
//			
//		for(int star=1;star<=row;star++) 
//			{
//				System.out.print("*");
//			}}
//			if(row>=6 && row<=9) {
//				for(int star=1;star<=10-row;star++) {
//					
//						
//			System.out.print("*");
//				}}
//			
//		System.out.println();
//		}
		
		
		
//		for(int row=1;row<=9;row++) {
//			if (row>=1 && row<=5) {
//				for(int s=4;s>=row;s--) {
//					System.out.print(" ");
//				}
//
//		for(int star=1;star<=row;star++) 
//			{
//				System.out.print(" *");
//			}}
//			if(row>=6 && row<=9) {
//				for(int s=1;s<=row-5;s++ ) {
//					System.out.print(" ");
//				}
//				for(int star=1;star<=10-row;star++) {
//					
//						
//			System.out.print(" *");
//				}}
//			
//		System.out.println();
//		}
		
		
	
		for(int row=1; row<=5; row++) {

		   
		    for(int space=1; space<=5-row; space++) {
		        System.out.print(" ");
		    }

	
		    for(int star=1; star<=2*row-1; star++) {
		        System.out.print("*");
		    }

		    System.out.println();
		}
	
	}
	}
	


