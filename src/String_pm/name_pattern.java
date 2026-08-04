package String_pm;

public class name_pattern {

	public static void main(String[] args) {
		String p1="love";
		String s2=new String("");
		for(int i=0;i<p1.length();i++) 
		{
			s2=s2+p1.charAt(i)+p1.charAt(i);
			System.out.println(s2);
			
		}

	}

}
