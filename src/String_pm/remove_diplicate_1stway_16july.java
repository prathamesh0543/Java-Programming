package String_pm;

public class remove_diplicate_1stway_16july {
	public static void main(String[] args) {
		String s1="abcbca";
		for(int i=0;i<s1.length();i++)
	    {
			int c=0;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					c++;
				}
			}if(c==0)
			{
			System.out.println(s1.charAt(i));
			}
	    }

	}

}
