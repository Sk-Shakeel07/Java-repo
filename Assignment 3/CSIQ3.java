package com.assignment3;
import java.util.*;
public class CSIQ3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number :");
		int n2 = sc.nextInt();
		System.out.print("Enter 3rd number :");
		int n3 = sc.nextInt();
		if (n1>n2 && n2>n3) {
	    System.out.println("\"Increasing\"");
		}
		else if (n1<n2 && n2<n3) {
		System.out.println("\"Dereasing\"");
		}
		else {
		System.out.println("\"Neither Increasing Nor Decreasing\"");
		}
	}

}
