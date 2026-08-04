package ArrayCodes_JM;

import java.util.Scanner;

public class fact_26june {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		int fact[]=new int[arr.length];
		System.out.println("Enter element "+arr.length);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Factorial of each element: ");
		for(int i=0;i<arr.length;i++) {
			int fact2=1;
			for(int j=1;j<=arr[i];j++) {
				fact2=fact2*j;
				fact[i]=fact2;
				
			}
			System.out.println(fact[i]+" ");
		}

	} 




	}


