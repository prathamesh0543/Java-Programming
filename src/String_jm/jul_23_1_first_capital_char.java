package String_jm;

public class jul_23_1_first_capital_char {

	public static void main(String[] args) {
		
		String arr[]= {"prathamesh","chavan"};
		
		for(int i=0;i<arr.length;i++)
		{
			String nm[]=arr[i].split(" ");
			
			StringBuilder sb=new StringBuilder();
			
			for(String ch:nm)
			{
				sb.append(Character.toUpperCase(ch.charAt(0))).append(ch.substring(1)).append(" ");
				
				
			}
			arr[i]=sb.toString();
			
		}
		for( String name:arr)
		{
			System.out.print(name);
		}

	}

}
