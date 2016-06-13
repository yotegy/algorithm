package Basis.FileIO;

import java.util.Scanner;

public class Main205 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float a = in.nextFloat();
		float b = in.nextFloat();
		
		
		float sum = a+b;
		
		a = covertnum(a);
		b = covertnum(b);
		sum = covertnum(sum);
		
		System.out.printf("%.2f %.2f %.2f", a,b,sum);
		
		in.close();
		
	}
	
	public static float covertnum(float num){
		
		float temp = Math.round(num*100)/100f;
		
		
		return temp;
		
	}

}
