
package String_jm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class july_20_matches {

	public static void main(String[] args) {
		
		String a="Prathamesh";
		
		System.out.println(a.matches("[A-Za-z]+"));
		String vehical="MH12AB1234";
		System.out.println(vehical.matches("[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}"));
		
		String ch20="hello from omkar 123 to java 26";
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher(ch20);
		while(m.find())
		{
			System.out.println(m.group());
		}
		
		String s1="prathamesh 543 chavan";
		System.out.println(s1.replaceAll("\\d",""));
		
		System.out.println(s1.replaceAll("\\s","-"));
		
		String p1="prathamesh0543@gmail.com";
		String pc="^[A-za-z0-9._]+@[a-zA-Z]+\\.+[a-z]{2,}$";
		
		if(p1.matches(pc))
		{
			System.out.println("correct");
		
		}
		
	}

}
;