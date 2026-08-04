package ArrayCodes_JM;

public class july10_4alphabate {

	public static void main(String[] args) {
		char ch[]= {'f','r','t','a','z'};
		for(char c='a';c<='z';c++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(c==ch[j])
				{
					System.out.println(c);
				}
			}
		}

	}

}
