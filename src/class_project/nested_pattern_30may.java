package class_project;

public class nested_pattern_30may {

	public static void main(String[] args) {
		
//		// Pattern 1
//		for(int i=1;i<=3;i++)
//		{
//			for(int j=1;j<=3;j++) 
//			{
//				System.out.print(" * ");
//			}
//			System.out.println();
//		} 
		
		
		// pattern 1.2
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=5;j++) 
			{
				if(j==1 || j==5 || i==1 || i==4 ) {
					if((i==1 || i==4 || i==7) &&(j==5))
					{
						System.out.print(" ");
					}else {
						
					
					System.out.print("$");
				}
					}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		
		} 
	}
}

