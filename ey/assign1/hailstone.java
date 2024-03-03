package ey.assign1;

public class hailstone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		System.out.print("The sequence is: " + num);
		while(num!=1)
		{
			if (num % 2 == 0)
			{
				num=num/2;
				System.out.print(" "+num);
				
			}
	        else
	        {
	        	 num=(num*3)+1;
	        	 System.out.print(" "+num);
	        	 
	        }
		}
		System.out.println(" 1");
	}

}
