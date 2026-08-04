package String_pm;

public class jul_18_3pangram_3way {

	public static void main(String[] args) {
		String s1="zxcvbnmasdfgh@%jklqwertyuiop";
		
		int c=0;
		for(char ch='a';ch<='z';ch++)
		{
			if(s1.indexOf(ch)!=-1)
			{
				c++;
			}
		}
		if(c==26)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not");
		}

	}

}
