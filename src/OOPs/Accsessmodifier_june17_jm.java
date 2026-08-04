package OOPs;

class non_sameclass{
	int p5=40;
}

public class Accsessmodifier_june17_jm {
	int p=30;
	public static void main(String[] args) {
		Accsessmodifier_june17_jm k1=new Accsessmodifier_june17_jm();
		System.out.println("same class p = "+k1.p);
		
		non_sameclass k2=new non_sameclass();
		System.out.println("non same class p2 = "+k2.p5);
		
		
	}

}
