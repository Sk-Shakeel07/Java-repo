package com.assignment3;
import java.util.*;
public class CSIQ5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Input the year : ");
        int year = sc.nextInt();
      /* boolean b = (year%400==0)||(year%4==0 && year%100!=0);
        System.out.println(year +" is a leap year : " +b);*/
        boolean x = true;
        if ((year%400==0)||(year%4==0 && year%100!=0)) {
    	System.out.println(x);
    	System.out.println(year+" is a leap year");
       }
        else {
        System.out.println(!x);
        System.out.println(year+" is not a leap year");
        }
	}

}
