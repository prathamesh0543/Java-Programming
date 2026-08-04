package ArrayCodes_JM;

public class equality_july9 {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {1,3,2};
		
		if(a.length==b.length)
		{
			int c=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i]) 
				{
					c++;
				}
			}
				if(c==a.length){
					
						System.out.println("same array");
					}
				else
				{
					System.out.println("not same array");	
				}
				
			
				}
		
		else 
		{
			System.out.println("not same length");
		}
			}
		
	}


	


