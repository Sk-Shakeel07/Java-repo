package assignment2;

public class CMDHAQ1 {

	public static void main(String[] args) {
		double principle,rate,time,SI;
		 principle = Double.parseDouble(args[0]);
		 rate = Double.parseDouble(args[1]);
		 time = Double.parseDouble(args[2]);
		 SI = (principle*rate*time)/100;
		 System.out.println(SI);
		 
		
		
	

	}

}
