package assignment2;
import java.util.*;
public class UKI6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of seconds");
		System.out.print("Enter the time in seconds: ");
        double t = sc.nextDouble();
	

       
        double g = 32.174;

        
        double d = 0.5 * g * t * t;

       
        System.out.println("The distance traveled by the brick is " + d + " feet");

       
       
        
	}

}
