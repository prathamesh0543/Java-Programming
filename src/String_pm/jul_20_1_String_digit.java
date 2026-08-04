package String_pm;

public class jul_20_1_String_digit {

	public static void main(String[] args) {
		String p1="12345df890";
		for(int i=0;i<p1.length();i++)
		{
			if(p1.charAt(i)>='0' && p1.charAt(i)<='9')
			{
				int num=p1.charAt(i)-'0';
				
				int c=0;
				for(int j=1;j<=num;j++)
				{
					if(num%j==0)
					{
						c++;
					}
				}
				if(c==2)
				{
					System.out.println("prime no is: "+num);
				}
			}
		}

	}

}
