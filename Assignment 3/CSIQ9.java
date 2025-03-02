package com.assignment3;
import java.util.*;
public class CSIQ9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter three numbers: ");
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	if(x>y && x>z) {
	System.out.println("Largest number: "+x);
	if(y>z)
	System.out.println("2nd Largest number: "+y);
	else
	System.out.println("Largest number: "+z);
	}
	else if(y>x && y>z) {
	System.out.println("Largest number: "+y);
	if(x>z)
	System.out.println("2nd Largest number: "+x);
	else
	System.out.println("Largest number: "+z);
	}
	else {
	System.out.println("Largest number: "+z);
	if(x>y)
	System.out.println("2nd Largest number: "+x);
	else
	System.out.println("Largest number: "+y);
	}
	 

	}

}
