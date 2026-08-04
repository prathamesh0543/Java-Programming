package String_pm;

public class july_18_4_character_to_digit {

	public static void main(String[] args) {
		
//		System.out.println('1'-'0');
//		System.out.println('2'-'0');
//		System.out.println('3'-'0');
//		System.out.println('4'-'0');
//		System.out.println('5'-'0');
		
		String s1="1235fgxcvb";
		int sum=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				int num=s1.charAt(i)-'0';
//				System.out.println(num);
				sum=sum+num;
			}
		}
		System.out.println("sum : "+sum);


	}

}
