package assignment2;
import java.util.*;
public class UKIHA1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		        System.out.print("Enter the number of minutes: ");
		        long minutes = sc.nextLong();
		        

		        long minutesInYear = 365 * 24 * 60; // Assuming a year has 365 days
		        long years = minutes / minutesInYear;
		        long days = (minutes % minutesInYear) / (24 * 60);

		        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		    

	}

}
