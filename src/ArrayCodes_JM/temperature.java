package ArrayCodes_JM;

import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String weekdays[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int temp[][]= {{12,34},{23,33},{10,16},{23,33},{20,40},{23,33},{24,29}};
		
		System.out.println("enter day of the week0-6:?");
		String daynm=sc.next();
		int x=0;
		
		for (int i=0;i<7;i++)
		{
			if(weekdays[i].equals(daynm)) {
				x++;
				for(int j=0;j<2;j++) {
					if(j==2)
					{
		System.out.println("Min temp:"+temp[i][j]);
					}
					else {
						System.out.println("Max temp:"+temp[i][j]);
					}
				}
			}
		}
		}
		}
	


