package class_project;


public class abc {

	public static void main(String[] args) 
	{
	int num=100;
	 int sum=0;
	for(int j=1;j<=num;j++) {
	int c=0;
	for(int i=1;i<=j;i++) {
		if(j%i==0) {
			c++;
		}
	}if(c==2) {
		System.out.println("prime :"+j);
		sum=sum+j;
	}
	}System.out.println("sum of prime no :"+sum);
	}
}