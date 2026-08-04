package ArrayCodes_JM;

public class frequency_july3 {

	public static void main(String[] args) {
//		find frequency
		int a[]= {1,2,3,4,2,2,2,3,1};
		for(int j=1;j<=9;j++)
		{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==j)
			{
				c++;
			}
			
		}
		if(c!=0) {
			System.out.println("count of "+j+"is ="+c);
		}

	}

}
}
