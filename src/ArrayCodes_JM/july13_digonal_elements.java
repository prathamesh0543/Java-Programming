package ArrayCodes_JM;

public class july13_digonal_elements {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,},{5,3,4,},{6,3,7,},};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
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

	}}
