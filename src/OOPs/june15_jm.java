package OOPs;
class callbyref
{
		int x=10;
		int y=20;
		
		void input(callbyref address)
		{

			address.x=100;
			address.y=50;
		}
}
public class june15_jm {

	public static void main(String[] args) {
		callbyref n=new callbyref();
		System.out.println("Before :- "+n.x+" "+n.y);
		n.input(n);
		System.out.println("After  :- "+n.x+" "+n.y);
	}

}
