package assignment6;

public class MaSQ2 {

	public static void main(String[] args) {
	System.out.println("First 100 Pentagonal numbers with 10 numbers on each line: ");
	for(int i =1; i<=100; i++) {
	System.out.print(getPentagonalNumber(i)+" ");
	if(i%10==0) {
	System.out.println();
	}
	}
	}
    public static int getPentagonalNumber(int n) {
    return n*(3*n-1)/2;
	 }
}
