package ey.assign1;

public class Salary {

	public static void Disp_Salary(int amt) {
		// TODO Auto-generated method stub
		double dear = 0.1*amt;
		double H_rent = 0.07*amt;
		double gross = amt +dear+H_rent;
		double tax = 0.08*amt;
		double net = gross -tax;
		
		System.out.println("Basic Salary: " + amt + "\nDearness Aloowance: " + dear + "\nHouse Rent: "+ H_rent + "\nGross Salary: "+ gross + "\nIncome Tax: "+tax+"\nNet Salary: "+ net);
		
	}

	
	
	
	
	public static void main(String args[]) {
		
		Disp_Salary(35000);
		
	}
}