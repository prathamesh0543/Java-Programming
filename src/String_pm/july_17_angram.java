package String_pm;

import java.util.Arrays;

public class july_17_angram {

	public static void main(String[] args) {
		String s1="abc";
		String s2="bca";
		if(s1.length()==s2.length())
		{
			char ch[]=s1.toCharArray();
			char ch1[]=s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
		
			

			int c=0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==ch1[i])
				{
					c++;
				}
			}
			if(c==ch.length)
			{
				System.out.println("Angram");
			}
			else
			{
				System.out.println("its not Angram");
			}
		}
		else
		{
			System.out.println("Length is not same");
		}


	}

}
