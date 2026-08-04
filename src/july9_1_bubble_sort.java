
public class july9_1_bubble_sort {

	public static void main(String[] args) {
		
		int a[]= {5,4,3,2,1};
		for(int i=0;i<a.length;i++) { 
			for(int j=i+1;j<a.length;j++)//1<5t 2<5t
			{
				if(a[i]>a[j])  //5>4  4>3  3>2  2>1 
				{
					int temp=a[i];//5
					a[i]=a[j];//4
					a[j]=temp;//5
				}
			}
			System.out.println(a[i]);
		}

	}

}
