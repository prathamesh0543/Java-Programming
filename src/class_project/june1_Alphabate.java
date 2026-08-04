package class_project;
public class june1_Alphabate {
	public static void main(String[] args) {
		
//	System.out.println("---z---");
//
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=7;j++) 
//				
//			{if(i==1||i==7||i+j==8) {
//			
//				System.out.print("z");
//			}else {
//				System.out.print(" ");
//			}
//				
//			}		System.out.println();
//
//		}

		
//		//---X---
//		for(int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(j==i||j==8-i) {
//					System.out.print("x");
//				}else {
//				System.out.print(" ");	
//				}
//			}System.out.println();
//			
//		}
		
		
		//w
		
//		for (int i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(j==1||j==7||
//					(i+j==8 && i>3 )||
//					(i-j==0 && i>3)){
//					System.out.print(" w ");
//				}
//				else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println();
//		}
		
		//s
//		for(int  i=1;i<=7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==1||i==4||i==7||
//				(j==1&&i<4)||
//				(j==7&&i>4)) {
//					System.out.print("s");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		for(int i=1;i<=90;i++) {
			for(int j=90;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
}
}
