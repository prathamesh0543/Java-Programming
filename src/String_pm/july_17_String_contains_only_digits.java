package String_pm;

public class july_17_String_contains_only_digits {

	public static void main(String[] args) {
		String s1="123456709";
		
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				c++;
			}
		}
		if(c==s1.length())
		{
			System.out.println("contains all digits only");
		}
		else
		{
			System.out.println("contains all not digits only");
		}

	}

}
