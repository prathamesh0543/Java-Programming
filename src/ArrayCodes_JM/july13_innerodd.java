package ArrayCodes_JM;



public class july13_innerodd {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,3,4,2,},{6,3,7,8},{3,9,7,8}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(!(i==0 || i==a.length || j==0 || j==a.length))
				{
					if(a[i][j]%2==0)
					{
					System.out.print(i);
				}
				}
				else
				{
				System.out.print("* ");
				}
			}
			System.out.println();
			
		}
	}

}
