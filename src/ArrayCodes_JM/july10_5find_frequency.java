package ArrayCodes_JM;

public class july10_5find_frequency {

	public static void main(String[] args) {
		char ch[]= {'f','a','a','a','z','a','b','r','f','a','a','a','z','a','b','r'};
		for(char c='a';c<='z';c++)
		{
			int c1=0;
			for(int i=0;i<ch.length;i++)
			{
				if(c==ch[i])
				{
					c1++;
				}
			}
			if(c1!=0)
			{
				System.out.println(c+" = "+c1);
			}
		}

	}

}
