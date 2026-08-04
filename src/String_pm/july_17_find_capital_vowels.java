package String_pm;

public class july_17_find_capital_vowels {

	public static void main(String[] args) {
		String s1="ANCSJ0923SI";
	
		
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			
//			if(ch>='A' && ch<='z')
			{
				if(ch=='A' || ch == 'E' || ch== 'I' || ch =='O' || ch =='U')
				{
					System.out.println(ch);
				}
			}
		}

	}

}
