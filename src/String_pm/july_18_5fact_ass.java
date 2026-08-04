package String_pm;

public class july_18_5fact_ass {

	public static void main(String[] args) {
		String s1="1234567sdcv";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				int num=s1.charAt(i)-'0';
				
				int fact=1;
				if(num%2==0) 
				{
					for(int j=1;j<=num;j++)
					{
						fact=fact*j;
					}
					System.out.println("fact of "+num+" is :"+fact);
					
				}
			}
				
		}

	}

}
