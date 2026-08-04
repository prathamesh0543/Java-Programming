package ArrayCodes_JM;

import java.util.Scanner;

public class prime_june26 {
	public static void main(String[] args) {
		
		
		//PRIME NO AND NOT PRIME NOS
		
		Scanner sc=new Scanner(System.in);
		int arr[] = {2, 5, 8, 11, 15, 17};

        for (int i = 0; i < arr.length; i++) {

            int ab = 0;

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                    ab++;
                }
            }

            if (ab == 2) {
                System.out.println(arr[i] + " is Prime");
            } 
            else
            {
            	System.out.println(arr[i]+" not a prime");
            }
        }
    }

	}
