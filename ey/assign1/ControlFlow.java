package ey.assign1;
import java.time.*;

public class ControlFlow {

	public static void leapyear(int year) {
		// TODO Auto-generated method stub
		boolean flag = false;
		 
        Year checkyear = Year.of(year);
 
        flag = checkyear.isLeap();
 
        if (!flag)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
	}

	
	public static void odd_even(int num){
		
		if (num % 2 == 0)			 
            System.out.println("Entered Number is Even");
         else
        	System.out.println("Entered Number is Odd");
        
	}
	
	public static void valid_Date() {
		//not sure how to proceed
	}
	
	public static void power(int x, int n) {
		System.out.println("The answer is : ");
        double pow = 1;
        for (int i = 0; i < n; i++) {
            pow = pow * x;
        }
	  	System.out.println(pow);
	}
	
	// Factorial already done in another assignment
	// Checking Prime already done in another assignment
	
		

	
}
