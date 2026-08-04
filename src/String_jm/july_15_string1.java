package String_jm;

public class july_15_string1 {

	public static void main(String[] args) {
		String p="prathamesh";
		String p1[] =  {"Chavan", " prathamesh", " "};
		
		System.out.println(p);
		System.out.println(p1);
		
		for(int i=0;i<p1.length;i++)
		
		p=p.concat("prathamesh");
		System.out.println(p.hashCode());
		
		String pp1="java";
//		System.out.println(pp1.hashCode());
		System.out.println(System.identityHashCode(pp1));
		
		String pp2=new String ("java");
//		System.out.println(pp2.hashCode());
		System.out.println(System.identityHashCode(pp2));
		
		pp1=pp1.concat("Language");
//		System.out.println(pp1.hashCode());
		System.out.println(System.identityHashCode(pp1));
		
		pp2=pp2.concat("Programing language");
//		System.out.println(pp2.hashCode());
		System.out.println(System.identityHashCode(pp2));
		
		

	}

}
