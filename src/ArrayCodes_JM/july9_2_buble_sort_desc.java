package ArrayCodes_JM;

public class july9_2_buble_sort_desc {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,66};
		for(int i=0;i<a.length;i++) { 
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])  
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}


	}

}
