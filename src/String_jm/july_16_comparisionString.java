package String_jm;

public class july_16_comparisionString {

	public static void main(String[] args) {
		
		System.out.println("----------(== operator)-------------");
		
		String p1="JAVA";
		String p2="JAVA";
		String p3=new String ("JAVA");
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		System.out.println(p1==p2);
		System.out.println(p2==p3);
		
		System.out.println("----------(compareTo)-------------");
		
		String s1="A";
		String s2=" ";
		String s3=new String ("A");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		
		System.out.println("----------(equalsIgnoreCase)-------------");
		
		String n1="JAvA";
		String n2="JAVA";
		String n3=new String ("java");
		
		System.out.println(n1.equalsIgnoreCase(n2));
		System.out.println(n2.equalsIgnoreCase(n3));
		System.out.println(n1.equals(n2));
		
        

	}

}
