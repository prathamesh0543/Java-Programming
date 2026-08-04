package String_pm;

public class july_17_remove_duplicate_2way {

	public static void main(String[] args) {
		String s1="aabbcc";
		for(int i=0;i<s1.length();i++)
		{
			int c=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(s1.charAt(i));
			}
		}


	}

}
