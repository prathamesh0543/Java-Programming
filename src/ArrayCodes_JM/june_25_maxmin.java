package ArrayCodes_JM;

public class june_25_maxmin {

	public static void main(String[] args) {
		
		int arr[]= {45,89,34,26};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			if(arr[i]>min)
			{
				min=arr[i];
				
			}
			
		}
		System.out.println("Maximum element from array: "+max);
		System.out.println("Minimum element from array: "+min);

	}

}
