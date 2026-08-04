package ArrayCodes_JM;

public class array_jun30pm {
	public static void main(String[] args) {
		int a[]= {1,1,2,33,4,67};
		int ele=2;
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println("Element is not present....");
		}
		else {
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=ele)
				{
					System.out.println(a[i]);
				}
			
		}
		
	}

	}}
