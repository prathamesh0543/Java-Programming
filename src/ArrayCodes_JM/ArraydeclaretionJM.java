package ArrayCodes_JM;

import java.util.Scanner;

public class ArraydeclaretionJM {

	public static void main(String[] args) {
		//single dim 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		short size=sc.nextShort();
		short arr[]=new short[size];
		short i;
		System.out.println("Enter "+arr.length+" array elements ");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextShort();
			System.out.println(arr[i]);
		}
		System.out.println("Array elements are: ");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
		
		
//		short arr[]= {1,2,3,4,5};
//for(int i=0;i<arr.length;i++) {
////	System.out.print("["+arr[i]+"] ");
//	System.out.println("arr["+i+"]-> "+arr[i]+" ");
//}
	}

}
