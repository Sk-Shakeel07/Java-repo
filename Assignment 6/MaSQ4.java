package assignment6;

public class MaSQ4 {

	public static void main(String[] args) {
	for(int i=2000;i<=2020;i++) {
	System.out.println(numberOfDaysInYear(i)+" in year "+i);
	}
	}
    public static int numberOfDaysInYear(int year) {
    if((year %400==0)||(year%4==0&&year%100!=0)) {
    return 366;
    }
    else {
    return 365; 
    }
    }
}
