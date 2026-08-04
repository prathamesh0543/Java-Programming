package class_project;

public class may31_HW {
	public static void main(String[]args) {
		
		// R
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=5;j++) 
//			{
//				if(j==1 || j==5 || i==1 || i==4 ) {
//					if((i==1 || i==4 || i==7) &&(j==5))
//					{
//						System.out.print(" ");
//					}else {
//						
//					
//					System.out.print("$");
//				}
//					}
//				else 
//				{
//				System.out.print(" ");
//				}
//			}
//			System.out.println();
//		
//		} 
		
		//  B
		
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=5;j++) 
//			{
//				if(j==1 || j==5 || i==1 || i==4 ||i==7 ) {
//					if((i==1 || i==4 || i==7) &&(j==5))
//					{
//						System.out.print(" ");
//					}else {
//						
//					
//					System.out.print("$");
//				}
//					}
//				else 
//				{
//				System.out.print(" ");
//				}
//			}
//			System.out.println();
//		
//		} 
//		
//		
	//P
		
		

		
		

		        for(int i = 1; i <= 7; i++) {

		            for(int j = 1; j <= 5; j++) {

		                if(j == 1 ||
		                   ((i == 1 || i == 4) && j < 5) ||
		                   (j == 5 && i > 1 && i < 4)) {

		                    System.out.print("$ ");
		                }
		                else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.println();
		        }
		    }
		
	}
 

