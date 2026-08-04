package String_jm;

public class jul_23_4find_the_vowels {
	public static void main(String[] args) {
		
		String arr[]={"Raj ","Prathamesh","Rohan","ONkar","Tushar","Pranay"};
		int max=0;
		String names="";
		
		for(String name: arr)
		{
			int count =0;
			for(char ch:name.toLowerCase().toCharArray())
			{
				if (ch=='a' || ch=='e'||ch=='i' ||ch=='o' || ch=='u')
				{
					count++;
				}
			}
			if(count>max) {
				max=count;
				names=name;
			}
			else if (count==max)
			{
				names=names+=","+name;
			}
		}
		System.out.println("max vowel : "+max );
		System.out.println("Names : "+names);
	}

}
