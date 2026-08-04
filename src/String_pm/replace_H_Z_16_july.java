package String_pm;

public class replace_H_Z_16_july {

	public static void main(String[] args) {
		String s1="hello";//zello
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='h')
			{
				s2=s2+'z';
			}
			else
			{
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
