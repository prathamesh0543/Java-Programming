package ArrayCodes_JM;

public class equality2_july9 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,24,3,6};
		
		if(a.length==b.length)
		{
			int c=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i]) 
				{
					c++;
					System.out.println("not same array");
					break;
				}
			}
				if(c==a.length){
					
						System.out.println("same array");
					}
				
				}
		
		else 
		{
			System.out.println("not same length");
		}

	}

}
