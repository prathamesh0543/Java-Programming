package ArrayCodes_JM;

public class leaders_element_july9 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,};
		for( int i=0;i<a.length;i++) 
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					c++;
				}
				
			}
			if(c==0) {
				System.out.println(a[i]);
			}
		}

	}

}
