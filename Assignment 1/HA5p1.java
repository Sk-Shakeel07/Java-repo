package com.assignment;

public class HA5p1 {

	public static void main(String[] args) {
		int W,G,K,A,Z;
		W=10;
		G=20;
		K=30;
		A=40;
		System.out.println("case 1 = without using any variable");
		System.out.println("before swapping w="+W+" G="+G+" K="+K+" A="+A);
		W=W+A;
		G=W-G;
		W=W-G;
		A=G-W;
		K=G+A;
		System.out.println("after swapping W="+W+" G="+G+" K="+K+" A="+A);
		
		

	}

}
