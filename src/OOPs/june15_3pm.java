package OOPs;
class calci
{
	String add(int a,int b) {
		return "add = "+(a+b);
	}
	String sub(int a, int b) {
		return "sub = "+(a-b);
	}
	String mul(short c,short d) {
		return"multiplication = "+(c*d);
	}
}
public class june15_3pm {

	public static void main(String[] args) {
		calci c1=new calci();
		System.out.println(c1.add(5, 5));
		System.out.println(c1.sub((byte)4,(byte)2));
		System.out.println(c1.mul((short)5, (short)4));
	}

}
