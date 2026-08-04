package OOPs;

class pc07
{
	void ar(){
		System.out.println("prathamesh");
	}
}
class pc01 extends  pc07
{
	void ar() {
		System.out.println("Chavan");
	}
}
class pc02 extends  pc07
{
	void ar() {
		System.out.println("pc");
	}
}


public class june_19_jm_polymorphism {

	public static void main(String[] args) {
		pc01 p=new pc01();
		p.ar();
		
		pc02 p1=new pc02();
		p1.ar();
		
		System.out.println(p1 instanceof pc02 );
	}

}
