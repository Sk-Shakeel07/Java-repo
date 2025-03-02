package com.assignment;
import java.util.Scanner;


public class TakingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Taking input from the user");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number1");
		int a=sc.nextInt();
		System.out.println("enter  number2");
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        System.out.println("The sum of the number is");
        System.out.println(sum+  +sub);
        
		

	}

}
