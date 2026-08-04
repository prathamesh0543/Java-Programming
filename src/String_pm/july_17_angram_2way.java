package String_pm;

import java.util.Arrays;

public class july_17_angram_2way {

	public static void main(String[] args) {
		String s1="abc";
		String s2="bCa";
		if(s1.length()==s2.length())
		{
			char ch[]=s1.toLowerCase().toCharArray();
			char ch1[]=s2.toLowerCase().toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			System.out.println(ch);
			System.out.println(ch1);
			
			
			if(Arrays.equals(ch, ch1))
			{
				System.out.println("Angram");
			}
			else
			{
				System.out.println("not ");
			
			}
		}
		else
		{
			System.out.println("Length is not same");
		}

	}
}

	




	


