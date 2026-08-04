package String_pm;

public class replace_h_to_z_july16 {

	public static void main(String[] args) {

		String s1="hello";
		
		char ch[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			if(ch[i] == 'h')
			{
				ch[i]='z';
			}
		}
		System.out.println(ch);
	}

}
