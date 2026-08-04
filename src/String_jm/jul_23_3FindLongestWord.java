package String_jm;

public class jul_23_3FindLongestWord {

	public static void main(String[] args) {
		String s="Hello Hefshine Pune";
		String arr[]=s.split("\\s");
		int max=0; String word2="";
		for(String word:arr)
		{
			int l=word.length();
			if(l>max)
			{
				max=l;
				word2=word;
			}
		}
		System.out.println("Longest word : "+word2);
	}

}
