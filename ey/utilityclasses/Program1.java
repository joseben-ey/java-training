package ey.utilityclasses;
import java.util.Scanner;

public class Program1 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String bina=Integer.toBinaryString(num);
		String hexa=Integer.toHexString(num);
		String octa=Integer.toOctalString(num);

		System.out.println("The binary is  "+ bina);
		System.out.println("The Hexadecimal is  "+ hexa);
		System.out.println("The Octal is  "+ octa);
	}

}
