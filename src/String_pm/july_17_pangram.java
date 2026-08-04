package String_pm;

public class july_17_pangram {

	public static void main(String[] args) {
		String a1="zxcvbnmqwertyuiopasdfghjklzxcvbnm";
		int c=0;
		for(char ch='a';ch<='z';ch++)
		{
			for(int i=0;i<a1.length();i++)
			{
				if(ch==a1.charAt(i))
				{
					c++;//find the duplicate
					break;
				}
			}
		}
		System.out.println(c);
		if(c==26)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangram");
		}

	}

}
