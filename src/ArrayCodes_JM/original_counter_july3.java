package ArrayCodes_JM;

public class original_counter_july3 {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,2,1,};
		for(int i=0;i<a.length;i++)//0<6  1<6 2<6 3<6 4<6 5<6 6<6F
		{
			int c=0;
			for(int j=i+1;j<a.length;j++) //1<6 2<6  3<6
			{
				if(a[i]==a[j])//2<6 3<6 4<6 5<6 6<6F
				{
					c++;// 3<6 4<6 5<6 6<6F
				}       
			}if(c==0)//4<6 5<6 6<6
			{
				System.out.println(a[i]);//5<6 6<6F
			}
		}

	}

}
