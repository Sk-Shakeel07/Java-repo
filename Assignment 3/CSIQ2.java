package com.assignment3;
import java.util.*;
public class CSIQ2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Alice drank x ml of water today & x : ");
		int x = sc.nextInt();
		if (x>=5000) {
		System.out.println("Yes, Alice is following doctor’s advice");
		}
		else {
		System.out.println("No, Alice is not following doctor’s advice");
		}

	}

}
