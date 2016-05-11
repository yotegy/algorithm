package Basis.Func01;

import java.util.Scanner;

public class Main572 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float radius = in.nextFloat();

		calArea(radius);

		in.close();

	}

	public static void calArea(float radius) {

		float area = radius*radius*3.14f;
		
		area = Math.round(area*100);
		area = area/100f;
		
		System.out.printf("%.2f",area);

	}

}
