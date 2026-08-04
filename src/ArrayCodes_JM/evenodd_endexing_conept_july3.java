package ArrayCodes_JM;

public class evenodd_endexing_conept_july3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int b[]=new int[a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			b[index]=a[i];
			index++;
					
			}
			}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				b[index]=a[i];
				index++;
			}
			
		}
		System.out.println("b array : ");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+" "+i+" ");
		}
	}

}
