package ArrayCodes_JM;

public class july13_hollo_pattern {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4},{5,3,4,2,},{6,3,7,8},{3,9,7,8}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if((i==0 || i==a.length-1 || j==0 || j==a[i].length-1))
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
				}

	}

}
