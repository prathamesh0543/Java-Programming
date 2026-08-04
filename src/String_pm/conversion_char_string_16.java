package String_pm;

public class conversion_char_string_16 {

	public static void main(String[] args) {
		char ch[]= {'h','e','l','l','o'};
		String s1="hello";
		System.out.println(s1);
        
		for(int i=0;i<s1.length();i++)
		{
			
			ch[i]=s1.charAt(i);
		}
		for(int i=0;i<ch.length;i++)
			
		{
			System.out.println(ch[i]);
		}
		
//		char ch[]= s1.toCharArray();
//		System.out.println(ch);
		}

}
