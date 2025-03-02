package com.assignment3;
import java.util.*;
public class CSIQ6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter unit : ");
		int u = sc.nextInt();
		double amt = 0;
		if (u<=50) {
		amt = 3*u;
		}
		else if (u<=200) {
		amt = 3*50+4.80*(u-50);
		}
		else if (u<=200) {
		amt = 3*50+4.80*150+5.80*(u-50);
		}
		else {
		amt = 3*50+4.80*150+5.80*200+6.20*(u-50);
		}
		System.out.println("Total bill is "+amt);
	}

}
