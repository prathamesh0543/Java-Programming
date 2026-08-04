package String_pm;

public class july_15_String {

	
		public static void main(String[] args) {
			String p1="prathamesh";
			String p2="prathamesh";
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
			
			String p3=new String ("prathamesh");
			System.out.println(System.identityHashCode(p3));
			String p4=new String ("prathamesh");
			System.out.println(System.identityHashCode(p4));
			

	}

}
