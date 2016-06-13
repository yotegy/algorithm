package Basis.FileIO;

import java.util.Scanner;

public class Main627 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float num[] = new float[10];

		for (int k = 0; k < 10; k++) {

			num[k] = in.nextFloat();

		}

		float avg = (num[0] + num[9]) / 2.0f;

		avg = Math.round(avg * 10) / 10.0f;

		System.out.println(avg);

		in.close();

	}

}
