package assignment4;

public class IS1HAQ1 {

	public static void main(String[] args) {		
			    /*int n = 10;
		        int sumOfSquares = 0;
		        int sum = 0;
		        for (int i = 1; i <= n; i++) {
		        sumOfSquares += i * i;
		        sum += i;
		        }
		        int squareOfSum = sum * sum;		      
		        int difference = squareOfSum - sumOfSquares;		        
System.out.println("Difference between the sum of the squares and the square of the sum for the first "
		                                                    + n + " natural numbers is: " + difference);*/
		int sum = 0, square_sum = 0;
		System.out.println("The sum of the squares of the first ten natural numbers is: ");
		for(int i = 1;i<=10;i++)
		{
		if(i==1)
		System.out.print(i+"^2");
		else
		System.out.print(" + "+i+"^2");
		square_sum += (int)Math.pow(i,2);
		}
		System.out.print(" = "+square_sum);
		System.out.println("\nThe square of the sum of the first ten natural numbers is: ");
		for(int i = 1;i<=10;i++)
		{
		if(i==1)
		System.out.print("("+i);
		else
		System.out.print(" + "+i);
		sum += i;
		}
		System.out.println(")^2 = "+sum+"^2 = "+(int)Math.pow(sum,2));
		System.out.print("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+(int)Math.pow(sum,2)+" - "+square_sum+" = "+((int)Math.pow(sum,2)-square_sum));
		    }
		}
