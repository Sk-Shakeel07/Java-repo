package assignment4;

public class IS1HAQ2 {

	public static void main(String[] args) {
		
		        /*int limit = 1000;
		        int sum = 0;
		        for (int i = 1; i < limit; i++) {
		        if (i % 3 == 0 || i % 5 == 0) {
		        sum += i;
		        }
		        }
		        System.out.println("The sum of multiples of 3 or 5 below 1000 is: " + sum);*/
		int sum = 0;
		for(int i = 1;i<1000;i++)
		{
		if(i%3==0||i%5==0) {					
		sum += i;
		}
		}
		System.out.println("Sum of all the multiples of 3 or 5 below 1000 is "+sum);
		    }
		}
