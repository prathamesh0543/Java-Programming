package String_jm;

public class jul_23_2stringFrequencyCount {

	public static void main(String[] args) {


		String st="aaabbc";
		String ans="";
		int count =1;
		for(int i=0;i<st.length();i++)
		{
			if(i<st.length()-1 && st.charAt(i)==st.charAt(i+1))
			{
				count ++;
			}
			else
			{
				ans=ans+st.charAt(i)+count;
				count=1;
			}
		}
		System.out.println(ans);

	}

}
