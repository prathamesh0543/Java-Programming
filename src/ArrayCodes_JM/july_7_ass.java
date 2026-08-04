package ArrayCodes_JM;

public class july_7_ass {

	public static void main(String[] args) {
		  //print non zero first then all zeros
			int a[]= {1,7,2,7,1,4,7,1,5};
			int in=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=7)
				{
					a[in++]=a[i];
				}
			}
			
			for(int i=in;i<a.length;i++) 
			{
				if(a[i]!=7) 
				{
					a[i]=7;
				}
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}

		}

	}