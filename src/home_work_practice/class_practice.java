package home_work_practice;

class enjoy{
	int id;
	String name;
	int ic;
	void ab(int a,String b) {
		id=a;
		name=b;
		System.out.println(id);
		System.out.println(name);
			
	}
	void ns(int c,int d) {
		id=c;
		ic=d;
		System.out.println(id);
		System.out.println(ic);
	}
}

public class class_practice {

	public static void main(String[] args) {
		enjoy n=new enjoy();
		n.ab(12,"prathamesh");
//		System.out.println(n.id+" "+n.name);
		
		
		enjoy m=new enjoy();
		m.ns(34, 43);
//		System.out.println(m.id+" "+m.name);

	}

}
