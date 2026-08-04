package OOPs;

class E{
	E(int n){
		System.out.println("first ="+n);
	}
}
class Q extends E{
	Q()
	{
		super(7);
		System.out.println("second");
	}
}

public class june20_pm_supercostructor {

	public static void main(String[] args) {
		Q b=new Q ();
		
	}

}
