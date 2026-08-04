package String_pm;

public class jul_20_2_ass {

	public static void main(String[] args) {
		String s1="123hello45HELLO*&^%$#@";
		String s="";
		String s11="";
		String s111="";
		String s1111="";
		String s5="";

		
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>'a' && s1.charAt(i)<='z')
			{
				s=s+(s1.charAt(i));
			}
			
			
			else if(s1.charAt(i)>'A' && s1.charAt(i)<='Z')
			{
				s11=s11+s1.charAt(i);
			}
			
			else if(s1.charAt(i)>'0' && s1.charAt(i)<='9')
			{
				s111=s111+s1.charAt(i);
			}
			
			else {
				s1111=s1111+s1.charAt(i);
			}
			
		}
		System.out.println(s+"\n"+s11+"\n"+s111+"\n"+s1111);

		// new string =digit-special symbol-lowercase-uppercase
		s5=s111+s1111+s+s11;
		System.out.println(s5);
	}

}
