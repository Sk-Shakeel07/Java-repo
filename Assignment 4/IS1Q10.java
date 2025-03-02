package assignment4;
import java.util.*;
public class IS1Q10 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
   /* System.out.print("Enter a number: ");
	        int n = sc.nextInt();	        //1st try
	        int power = 1; 
	        int result = 1;	        
	        while (result <= n / 3) {
	            power++;
	            result *= 3;
	        }	        
	        System.out.println("Largest power of three less than or equal to " + n + " is: " + result); */
          /* System.out.print("Enter a number: ");
	        int n = sc.nextInt();	        //2nd try
	        int power = 1;
	        int result = 1;
	        
	        while (result * 3 <= n) {
	            result *= 3;
	        }	        
	        System.out.println("Largest power of three less than or equal to " + n + " is: " + result);	  */
	System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int i = 0;
    while(Math.pow(3, i)<=n) {
    i++;
   
    }
    int o = (int) Math.pow(3, i-1);
	System.out.println("Largest power of three less than or equal to " + n + " is: " + o);      
	    }
	}
	        
	        
	    
