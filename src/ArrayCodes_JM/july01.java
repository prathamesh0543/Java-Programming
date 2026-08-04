package ArrayCodes_JM;

public class july01 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int rowsum=0,colsum=0;
		for(int i=0;i<arr.length;i++) {
			
			 for(int j=0;j<arr.length;j++) {
			
				 System.out.print(arr[j][i]+" ");
			 }
			 System.out.println();
	}
		System.out.println("left angle triangle");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++) {
			if(i==j) {
				System.out.print(arr[i][j]+" ");
			}
			else {
				System.out.println("0"+" ");
			}
			System.out.println();
			
		}
	}
		
		
	}

}
