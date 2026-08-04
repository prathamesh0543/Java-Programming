package ArrayCodes_JM;

public class july11_selection_sort {

	public static void main(String[] args) {
		int a[]= {5,4,7,2,1};
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j]) {
								
				min=j;
				}
			}
					
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		System.out.println(a[i]);
		}
		
		}

	}


