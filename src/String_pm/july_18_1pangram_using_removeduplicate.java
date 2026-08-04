package String_pm;

public class july_18_1pangram_using_removeduplicate {

	public static void main(String[] args) {
		String s1="zxcvbnmasdfgh^$jklqwertyuiopzxcvbnm";
		String s2="";
		
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
				if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
					
				
				s2=s2+s1.charAt(i);
				}
			}
		}
		if(s2.length()==26)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not");
		}
		
		
		
			
		

	}

}
