package com.assignment3;
import java.util.Scanner;
public class CSIHAQ2 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a day(0 = Sunday,1 = Monday,and so on):  ");
    int day = sc.nextInt();
    System.out.print("Enter the number of days elapsed since today: ");
    int elapsedDay = sc.nextInt();
    System.out.print("Today is ");
    switch(day%7) {
    case 0:System.out.println("Sunday");break;
    case 1:System.out.println("Monday");break;
    case 2:System.out.println("Tuesday");break;
    case 3:System.out.println("Wednesday");break;
    case 4:System.out.println("Thursday");break;
    case 5:System.out.println("Friday");break;
    default:System.out.println("Saturday");
    }
    int nextDay = (day + elapsedDay)%7;
    System.out.print("and the future day is ");
    switch(nextDay) {
    case 0:System.out.println("Sunday");break;
    case 1:System.out.println("Monday");break;
    case 2:System.out.println("Tuesday");break;
    case 3:System.out.println("Wednesday");break;
    case 4:System.out.println("Thursday");break;
    case 5:System.out.println("Friday");break;
    default:System.out.println("Saturday");
    }
	}

}
