package ey.assign2;
import java.util.Scanner;

public class calculateProfit {

	static float calculateProfit(int numAttendees) {

		float profit=0;
		profit= (float) ( (5*numAttendees) - (20+(0.5*numAttendees)) );
		return profit;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of attendees ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		float profit = calculateProfit(num);
		System.out.println("The profit the theater makes is "+ profit);
	}

}
