package ArrayCodes_JM;

public class july_7 {

	

	    public static void main(String[] args) {

	        int a[] = {1,0,2,0,3,0,4,0,5,0};

	        int index = 0;

	        
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] != 0) {
	                a[index++] = a[i];
	            }
	        }

	        
	        for (int i = index; i < a.length; i++) {
	            a[i] = 0;
	        }

	        System.out.println("Updated :");

	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
	}
