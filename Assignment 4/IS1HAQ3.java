package assignment4;

public class IS1HAQ3 {

	public static void main(String[] args) {		
		       /* int count = 0;
		        for (int i = 1000; i <= 2000; i++) {
		        if (count < 5) {
		        System.out.print(i + " ");
		        count++;
		        }
		        else {
		        System.out.println();
		        count = 0;
		        }
		        }*/
		int i = 1000;
		while(i<=2000)
		{
		System.out.print(i+" ");
		if(++i%5==0)
		{
		System.out.println();
		}
		    }
	}
	}
