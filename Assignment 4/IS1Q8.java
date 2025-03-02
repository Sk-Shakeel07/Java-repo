package assignment4;
import java.util.*;
public class IS1Q8 {

   public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int max = 10, min = 1;
		  while(true) {
		  int com = (int)(Math.random()*(max-min+1))+min;
		  System.out.print("Enter your guess: ");
		  int user = sc.nextInt();
		  System.out.println("Computer guess: "+com);
		  System.out.println("User guess: "+user);
		  if(user == com) {
		  System.out.println("Good guess");
		  break;
		  }
		  else if(user>com) 
		  System.out.println("Too high , try again");
		  
		  else 
		  System.out.println("Too low , try again");
		  
		  }
	}

}
