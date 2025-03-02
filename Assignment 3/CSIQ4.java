package com.assignment3;
import java.util.*;
public class CSIQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max = 9 , min = 1;
		int x =(int)(Math.random()*(max - min)+min);				
		System.out.print("Enter user number : ");
		int n = sc.nextInt();
		System.out.println("You guesses :  "+n);				
		System.out.println("Computer guesses : "+x);
        if (n == x) {
        System.out.println("\"You got it right\"");
        }
        else if (n - x == 1 || n - x == -1) {
        System.out.println("\"You almost there\"");
        }
        else {
        System.out.println("\"You got it wrong\"");
        }
	}

}
