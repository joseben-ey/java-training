package ey.assign2;
import java.util.Scanner;

public class calTax {

	static double calInterest(int amt)
	{
		if (amt <=240)
			return 0;
		else if (amt>240 & amt<=480) 
			return amt*0.15;
		else
			return amt*0.28;

	}
	
	public static void main (String args[])
	{
		System.out.print("Enter the gross pay: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		double tax = calInterest(num);
		System.out.println(" \nThe tax is: " + tax);
	}


}
