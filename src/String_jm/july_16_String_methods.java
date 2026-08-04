package String_jm;

public class july_16_String_methods {
	
	public String toString()
	{
		return "I am class object";
	}

	public static void main(String[] args) {
		System.out.println("----------(length)-------------");

		String s1="prathamesh";
		System.out.println("length is : "+s1.length());

		System.out.println("----------(replace)-------------");
		

		String s5="prathamesh";
		String s6="chavan";
		
//		replace single char
		System.out.println(s5.replace('p','P'));
		
		
		System.out.println(s5.replace(s5,s6));
		
		System.out.println("----------(substring)-------------");
		
		String pc="My name is Pratahamesh";
		System.out.println(pc.substring(7));
		System.out.println(pc.substring(0, 10));// start to end
		
		System.out.println("----------(toLowerCase & toUpperCase )-------------");
        
		
		String p5="PRATHAMESH";
		String o5="prathamesh";
		System.out.println(p5.toLowerCase());
		System.out.println(o5.toUpperCase());
		
		System.out.println("----------(toString)-------------");

		july_16_String_methods pp= new july_16_String_methods();
		System.out.println(pp);
		
		System.out.println("----------(valueOf)-------------");
		
		int y=29;
		int x=56;
		
		System.out.println(y+x);
		String y1=String.valueOf(y);
		String x1=String.valueOf(x);
		System.out.println(y1+x1);


		
			
		}

	}


