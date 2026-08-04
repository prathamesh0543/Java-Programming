package class_project;

public class June3_HollowPattern {

	public static void main(String[] args) {
		
		        System.out.println("      ."
		        		+ "");
		        System.out.println("      |");
		        System.out.println("      |");

		        for(int i=1; i<=4; i++) {
		            System.out.print("   ");

		            for(int j=1; j<=9; j++) {
		                if(i==1 || i==4 || j==1 || j==9) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }

		        for(int i=1; i<=5; i++) {
		            for(int j=1; j<=13; j++) {
		                if(i==1 || i==5 || j==1 || j==13) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		    
	}
	}
		
		
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if(j==1||i==5||j==i) {
//					System.out.print("  *");
//				}
//				else {
//					System.out.print("   ");
//				}
//				}
//			System.out.println();
//		}
		
		
		
		
//		//Hollow  Square
//		for( int i=1;i<=5;i++) {
//			for(int j=1;j<=4;j++) {
//				if(!(i>1&&i<5&&j>1&&j<4)) {
//				if(i==1||i==5||j==1||j==4) {
//					System.out.print(" *");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

	


