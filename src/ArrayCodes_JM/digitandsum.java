package ArrayCodes_JM;

public class digitandsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int arr[] = {10, 2, 13, 5, 22};
		        int singleDigitSum = 0;
		        int doubleDigitSum = 0;

		        for (int i = 0; i < arr.length; i++) {

		            if (arr[i] <= 9) {
		                singleDigitSum = singleDigitSum + arr[i];
		            } 
		            else if (arr[i] >= 10 && arr[i] <= 99) {
		                doubleDigitSum = doubleDigitSum + arr[i];
		            }
		        }

		        System.out.println("Single digit sum: " + singleDigitSum);
		        System.out.println("Double digit sum: " + doubleDigitSum);
		    }
		}
	
