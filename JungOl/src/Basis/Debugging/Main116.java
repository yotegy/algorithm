package Basis.Debugging;

import java.util.Scanner;

public class Main116 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		float avg = (a+b+c)/3f;
		
		avg = (Math.round(avg*10f))/10f;
		
		System.out.printf("%.1f¡°",avg);
		
	}

}
