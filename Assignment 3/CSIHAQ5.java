package com.assignment3;
import java.util.Scanner;
public class CSIHAQ5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter gender (M/F): ");
	        char gender = sc.next().charAt(0);

	        System.out.print("Enter first name: ");
	        String firstName = sc.next();

	        System.out.print("Enter last name: ");
	        String lastName = sc.next();

	        System.out.print("Enter age: ");
	        int age = sc.nextInt();
 
	        if (gender == 'F') {
	            if (age >= 20) {
	                System.out.print("Are you married? (yes/no): ");
	                String marriedStatus = sc.next();
	                if (marriedStatus.equalsIgnoreCase("yes")) {
	                    System.out.println("Mrs. " + firstName + " " + lastName);
	                } else {
	                    System.out.println("Ms. " + firstName + " " + lastName);
	                }
	            } else {
	                System.out.println(firstName + " " + lastName);
	            }
	        } else if (gender == 'M' && age >= 20) {
	            System.out.println("Mr. " + firstName + " " + lastName);
	        } else {
	            System.out.println(firstName + " " + lastName);
	        }
	    }
	}
	    