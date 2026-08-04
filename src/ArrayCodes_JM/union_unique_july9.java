package ArrayCodes_JM;

public class union_unique_july9 {

	public static void main(String[] args) {
		int a[]= {11,2,3};
		int b[]= {11,22,4};
		
		int c[]=new int [a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}
		for(int i=0;i<b.length;i++){
			c[index++]=b[i];
		}
		System.out.println("c array: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" "+i);
		}
		System.out.println("remove dulpcates: ");
		for(int i=0;i<c.length;i++)
		{
			int c1=0;
			for(int j=0;j<i;j++) {
				c1++;
			}
			
		}
		if(c1==0)
		{
			System.out.println(c[i]);
		}
		

	}

}
