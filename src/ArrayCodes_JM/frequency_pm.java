package ArrayCodes_JM;

public class frequency_pm {

	
			public static void main(String[] args) {
			
			// find frequency of unique elements 
			
			int a[]= {1,2,3,4,3,3,1,4,1,2,3,45};
			int max_frequency=Integer.MIN_VALUE;
			int min_frequency=Integer.MAX_VALUE;;
		 
			for(int i=0;i<a.length;i++)     // i=0  0<12 -----------i = 1
											// i=1  1<12
			{  
				int c=0;
				
				for(int j=0;j<i;j++) {     // j=0   0<0f -----------j=1
				if(a[i]==a[j])             // j=1   1<1f
				{
				
					c++;
				}
			}
			if(c==0)                      //  0=0t   0=0t
			{
//				System.out.println("Elements : "+a[i]);----------------a[0]=1 , a[1]=2
		
			for(int k=0;k<a.length;k++)   // k=0   0<12
			{							
				if(a[i]==a[k]) {         // a[0]==a[0]  :  1=1 
										 // a[0]==a[6]  :  
					c++;				//  c=1  2 
				}
			}
				System.out.println(a[i] +" Freq  :"+c);  
				if(c>max_frequency) {
												
					max_frequency=c;
				
				
				}
				if(c<min_frequency) {
					min_frequency=c;
					
				}
			}
		  }
			System.out.println("Maximum  = "+max_frequency);
			System.out.println("Minimum  = "+min_frequency);
		}
	}