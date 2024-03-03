package ey.assign2;
import java.util.Scanner;

public class calInterest {

	public static void calInterest(int amt)
	{
		if (amt < 1000)
			System.out.println("The interest is: " + amt*0.04);
		else if (amt< 5000) 
			System.out.println("The interest is: " + amt*0.045);
		else
			System.out.println("The interest is: " + amt*0.05);

	}
	
	public static void main (String args[])
	{
		System.out.println("Enter the amount you want to deposit: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		calInterest(num);
	}
}
