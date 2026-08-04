package OOPs;

class non_sameclass1{
	public int v1=30;
}

class same_packsage_subclass extends non_sameclass1
{
	void display() {
		System.out.println("parent v1 = "+v1);
	}
}

public class accessmodifiers_june17 {
	public int v=20;

	public static void main(String[] args) {

		accessmodifiers_june17 p=new accessmodifiers_june17();
		System.out.println(p.v);
		
		non_sameclass1 p1=new non_sameclass1();
		System.out.println(p1.v1);
		
		same_packsage_subclass p2=new same_packsage_subclass();
		p2.display();
		
		
		
	}

}
