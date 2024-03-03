package ey.assign2;
import java.util.Scanner;

public class prime_num {
	
	static int prime_num(int n) 
    {   int sum=0;
        if (n <= 1) 
             System.out.println("Enter above 1: ");
       while (n>1) {
    	   int flag=0;
    	   for (int i = 2; i <= n / 2; i++) 
               if (n % i == 0) 
                   flag=1;
           if (flag==0)
        	   sum=sum+1;
           n=n-1;
          } 
       return sum;
    }
	
	public static void main(String args[])
	{
		System.out.print("Enter the range ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = prime_num(num);
		System.out.println("The number of numbers below the given range is "+ sum);
	}
}
