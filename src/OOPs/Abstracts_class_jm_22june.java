package OOPs;

abstract class A0
{
	abstract void callme(); 
	void show()
	{
		int x=10;
		System.out.println("x="+x);
	}
	
}
 class v extends A0 {
	
	void callme() {
		System.out.println("heLLo I aM abSTraCT meTHod");
	}
	
}

public class Abstracts_class_jm_22june {

	public static void main(String[] args) {
		v ob=new v();
		ob.callme();
		ob.show();
	}

}
