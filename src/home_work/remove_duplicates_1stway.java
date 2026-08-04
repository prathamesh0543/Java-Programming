package home_work;

public class remove_duplicates_1stway {

	public static void main(String[] args) {
		String a1="abjhjhba";
		
		for(int i=0;i<a1.length();i++)
		{
			int c=0;
			for(int j=i+1;j<a1.length();j++)
			{
				if(a1.charAt(i)==a1.charAt(j))
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(a1.charAt(i));
			}
		}

	}

}
