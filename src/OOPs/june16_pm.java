package OOPs;

class ns{
	int n;
	String name;
	float marks;
	
	ns(int n,String name, float marks) {
		this.n=n;
		this.name=name;
		this.marks=marks;
	}
	void set() {
		System.out.println("n= "+n+" name= "+name+" marks= "+marks);
	}
}

public class june16_pm {

	public static void main(String[] args) {
		ns t1=new ns(3,"prathamesh",90.8f);
		t1.set();
	}

}
