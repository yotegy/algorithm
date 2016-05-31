package Basis.Func02;

import java.util.Scanner;

public class Main181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("원의 반지름 : ");
		double radius = in.nextDouble();
		
		printArea(radius);
		
		in.close();
		
	}

	private static void printArea(double radius) {
		// TODO Auto-generated method stub
		
		double rate = 31415.92f;
		
		radius = radius*100;
		
		double result = radius*radius*rate;
		
		result = result/100000000;
		
		System.out.printf("원의 넓이 = %.3f\n", result);
		
	}

}
