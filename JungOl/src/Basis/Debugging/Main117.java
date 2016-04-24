package Basis.Debugging;

import java.util.Scanner;

public class Main117 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		
		int sum = (int)(Math.floor(a) + Math.floor(b) + Math.floor(c));
		
		int avg = (int)(Math.floor((a+b+c)/3));
		
		
		System.out.printf("√—¡° %d¡°\n",sum);
		System.out.printf("∆Ú±’ %d¡°\n",avg);
		
		
	}

}
