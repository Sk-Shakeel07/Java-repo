package assignment2;
import java.util.*;
public class UKIHA2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		        System.out.print("Enter the number of eggs: ");
		        int eggs = sc.nextInt();
		       

		        int gross = eggs / 144;  // Calculate the number of gross
		        int remainingEggs = eggs % 144;  // Calculate the remaining eggs
		        int dozens = remainingEggs / 12;  // Calculate the number of dozens
		        int extraEggs = remainingEggs % 12;  // Calculate the extra eggs

		        System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen, and " + extraEggs + " extra.");
		   

	}

}
