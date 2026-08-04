package ArrayCodes_JM;
import java.util.Scanner;


public class armstrong_array {


		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int arr[] = new int[4];

		        System.out.println("Enter 4 elements:");

		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = sc.nextInt();
		        }

		        for (int i = 0; i < arr.length; i++) {

		            int num = arr[i];
		            int original = num;
		            int sum = 0;

		            while (num > 0) {
		                int rem = num % 10;
		                sum = sum + (rem * rem * rem);
		                num = num / 10;
		            }

		            if (sum == original) {
		                System.out.println(original + " is Armstrong Number");
		            } else {
		                System.out.println(original + " is Not Armstrong Number");
		            }
		        }

		        sc.close();
		    }
		

}
