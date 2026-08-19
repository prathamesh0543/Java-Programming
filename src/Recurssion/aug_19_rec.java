package Recurssion;

public class aug_19_rec {
	int fact(int n) {
		if(n<=1)
		{
			return 1;
		}else {
		return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		aug_19_rec b=new aug_19_rec();
		int ans=b.fact(5);
		System.out.println("factorial : "+ans);

	}

}
