package com.assignment;
import java.util.Scanner;
public class UKI2 {
private static Scanner scanner = new Scanner (System.in);
	public static void main(String[] args) {
		//DistanceConversion.java
	//	import java.util.Scanner;
		//public class DistanceConversion
		{
		//private static Scanner scanner = new Scanner (System.in);
	//	public static void main (String [] args)
		{
		double meters;
		int choice;
		double kilometers, inches, feet;
		System.out.print("Enter a distance in meters:");
		meters = Double.parseDouble(scanner.nextLine());
		choice=getUserChoice();
		switch(choice)
		{
		case 1:
		kilometers=convertToKilometers(meters);
		System.out.println(meters +" meters = " + kilometers + " kilometers.");
		break;
		case 2:
		inches=convertToInches(meters);
		System.out.println(meters +" meters = " + inches + " inches.");
		break;
		case 3:
		feet=convertToFeet(meters);
		System.out.println(meters +" meters = " + feet + " feet.");
		break;
		case 4:
		System.out.println("Thank you!");
		System.out.println("Program terminated");
		System.exit(0);
		}}}
		}
		public static int getUserChoice()
		{
		int userchoice;
		System.out.println("1. Convert to kilometers ");
		System.out.println("2. Convert to inches ");
		System.out.println("3. Convert to feet ");
		System.out.println("4. Quit the program ");
		do
		{
		System.out.println("Enter your choice [1 - 4] : ");
		userchoice=Integer.parseInt(scanner.nextLine());
		if(userchoice<1 || userchoice>4)
		System.out.println("Error: Invalid Chocie");
		}while(userchoice<1 || userchoice>4);
		return userchoice;
		}
		public static double convertToKilometers(double meters)
		{
		double kilometers = meters * 0.001;
		return kilometers;
		}
		public static double convertToInches(double meters)
		{
		double inches = meters * 39.37;
		return inches;
		}
		public static double convertToFeet(double meters)
		{
		double feet = meters * 3.281;
		return feet;
		}
		}
