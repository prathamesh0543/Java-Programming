package String_pm;

public class pattern_16july {

	public static void main(String[] args) {
		String s1="Prathamesh";
		String s2=new String("");
		 
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i)+s1.charAt(i);
			System.out.println(s2);
		}

	}

}
