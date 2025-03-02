package com.assignment3;
import java.util.*;
public class CSIHAQ1 {

	public static void main(String[] args) {
   /* Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Rock-Paper-Scissors!");
    System.out.print("Enter 0 for Scissor, 1 for Rock, or 2 for Paper: ");
    int userChoice = sc.nextInt();
    int computerChoice = (int) (Math.random() * 3);
    if (userChoice < 0 || userChoice > 2) {
	System.out.println("Invalid input. Please enter 0, 1, or 2.");
    } 
    else {
    String[] options = {"Scissor", "Rock", "Paper"};
    System.out.println("You chose: " + options[userChoice]);
	System.out.println("Computer chose: " + options[computerChoice]);
    if (userChoice == computerChoice)
    {
    System.out.println("It's a draw!");
    }
    else if ((userChoice == 0 && computerChoice == 2) ||(userChoice == 1 && computerChoice == 0) ||
    		(userChoice == 2 && computerChoice == 1))
    {
    System.out.println("Congratulations! You win!");
	}  
    else
    {
    System.out.println("Sorry! Computer wins!");
    }
    }    */
		Scanner sc = new Scanner(System.in);
		System.out.println("Scissor, Rock, and Paper game between Computer and You");
		System.out.println("Rule: 0 for Scissor, 1 for Rock, and 2 for Paper");
		int min = 1, max = 3;
		int com = (int)(Math.random()*(max-min+1))+min;
		System.out.println("Enter your choice: ");
		int user = sc.nextInt();
		String mess_com = "", mess_user = "";
		switch(com)
		{
		case 0: mess_com = "Scissor"; break;
		case 1: mess_com = "Rock"; break;
		default: mess_com = "Paper";
		}
		switch(user)
		{
		case 0: mess_user = "Scissor"; break;
		case 1: mess_user = "Rock"; break;
		default: mess_user = "Paper";
		} if(com == user)
		{
		System.out.println("The computer is "+mess_com+". You are"+mess_user+" too. It is a draw");
		}
		else if((com == 1 && user == 0)||(com == 0 && user == 2)||(com == 2 && user ==
		1))
		{
		System.out.println("The computer is "+mess_com+". You are"+mess_user+". Computer won");
		}
		else
		{
		System.out.println("The computer is "+mess_com+". You are"+mess_user+". You won");
    }
    }
}

